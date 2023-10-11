package com.acorn.day4.download;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

@Controller
public class Download {
	
	String fileDir ="c:\\test\\upload\\";
	
	@GetMapping("/download")
	public String form() {
		// 이 메서드는 "/download" 경로로의 HTTP GET 요청을 처리하며, "form-download"라는 뷰 템플릿을 반환합니다.
		return "form-download";		
	}
	
	@PostMapping("/upload2")
	public String upload(String title, MultipartFile file, Model model) throws IllegalStateException, IOException {
		// 이 메서드는 "/upload2" 경로로의 HTTP POST 요청을 처리합니다.
		// title은 문자열 매개변수이며, file은 업로드된 파일을 나타내는 MultipartFile입니다.
		
		if (!file.isEmpty()) {
			// 만약 업로드된 파일이 비어있지 않다면 실행됩니다.
			String fileRealName = file.getOriginalFilename(); // 업로드된 파일의 원래 이름을 가져옵니다.
			String fullPath = fileDir + fileRealName; // 파일을 저장할 전체 경로를 생성합니다.
			file.transferTo(new File(fullPath)); // 업로드된 파일을 지정된 경로에 저장합니다.
			model.addAttribute("fileName", fileRealName); // 모델에 파일 이름을 추가합니다.
		}
		
		// "upload-ok-download" 뷰 템플릿을 반환합니다.
		return "upload-ok-download";
	}

	@RequestMapping(value="/attach/{fileName:.*}", method=RequestMethod.GET)
	public ResponseEntity<UrlResource> fileDownload(@PathVariable String fileName) throws MalformedURLException {
		// 이 메서드는 "/attach/{fileName}" 경로로의 HTTP GET 요청을 처리합니다.
		// {fileName}은 경로 변수로 파일 이름을 나타냅니다.

		System.out.println("fileName: " + fileName); // 파일 이름을 출력합니다.

		UrlResource resource = new UrlResource("file:c:\\test\\upload\\" + fileName); // 다운로드할 파일을 나타내는 UrlResource를 생성합니다.
		String encodedUploadFileName = UriUtils.encode(fileName, StandardCharsets.UTF_8); // 파일 이름을 URL로 안전하게 인코딩합니다.
		String contentDisposition = "attachment; filename=\"" + encodedUploadFileName + "\""; // 다운로드 시 파일을 첨부파일로 처리하도록 헤더를 설정합니다.
		
		// ResponseEntity를 사용하여 UrlResource를 응답으로 반환하고 Content-Disposition 헤더를 설정합니다.
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition).body(resource);
		// 서버의 리소스(자원)을 제공할 때 사용
	}
}
