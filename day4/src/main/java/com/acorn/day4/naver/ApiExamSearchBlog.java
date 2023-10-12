package com.acorn.day4.naver;

//네이버 검색 API 예제 - 블로그 검색
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ApiExamSearchBlog {

	public static void main(String[] args) {
		//클래스 인스턴스 생성
		ApiExamSearchBlog api = new ApiExamSearchBlog();
		//네이버 API를 호출하고 결과를 출력
		String result = api.getNaverAPI();
		System.out.println(result);

		// JSON DATA => ArrayList<ItemDTO>

		// String(json구조를 가진) -> JSON 변환

	}

	public String getNaverAPI() {
		//네이버 API를 호출하기 위한 클라이언트 아이디와 시크릿
		String clientId = "hPs16SKohR99BCea9pXa"; // 애플리케이션 클라이언트 아이디
		String clientSecret = "GBxMoyyT8d"; // 애플리케이션 클라이언트 시크릿

		String text = null;
		try {
			//검색어를 UTF-8로 인코딩
			text = URLEncoder.encode("빵", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			//예외처리 : 검색어 인코딩 실패
			throw new RuntimeException("검색어 인코딩 실패", e);
		}

		//네이버 API의 요청 URL
		String apiURL = "https://openapi.naver.com/v1/search/shop?query=" + text; // JSON 결과
		//XML 형식으로 결과를 받으려면 아래 URL 사용
		// String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text;
		// // XML 결과

		//HTTP 요청에 필요한 헤더 정보 설정
		Map<String, String> requestHeaders = new HashMap<>();
		requestHeaders.put("X-Naver-Client-Id", clientId);
		requestHeaders.put("X-Naver-Client-Secret", clientSecret);
		
		//HTTP 요청을 보내고 결과를 받음
		String responseBody = get(apiURL, requestHeaders);

		//결과를 출력
		System.out.println(responseBody);

		return responseBody;
	}

	//HTTP GET 요청을 보내는 매서드
	private static String get(String apiUrl, Map<String, String> requestHeaders) {
		//HTTP 연결을 설정
		HttpURLConnection con = connect(apiUrl);
		try {
			con.setRequestMethod("GET");
			for (Map.Entry<String, String> header : requestHeaders.entrySet()) {
				con.setRequestProperty(header.getKey(), header.getValue());
			}

			int responseCode = con.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
				//정상적인 응답을 받은 경우, 응답 본문을 읽어서 반환
				return readBody(con.getInputStream());
			} else { // 오류 발생
				//오류발생시, 에러 스트림을 읽어서 반환
				return readBody(con.getErrorStream());
			}
		} catch (IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		} finally {
			con.disconnect();
		}
	}

	//API에 연결을 수행하는 매서드
	private static HttpURLConnection connect(String apiUrl) {
		try {
			URL url = new URL(apiUrl);
			return (HttpURLConnection) url.openConnection();
		} catch (MalformedURLException e) {
			//예외처리 : 잘못된 API URL
			throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
		} catch (IOException e) {
			//예외처리 : 연결 실패
			throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
		}
	}

	//HTTP 응답 본문을 읽는 매서드
	private static String readBody(InputStream body) {
		InputStreamReader streamReader = new InputStreamReader(body);

		try (BufferedReader lineReader = new BufferedReader(streamReader)) {
			StringBuilder responseBody = new StringBuilder();

			String line;
			while ((line = lineReader.readLine()) != null) {
				responseBody.append(line);
			}

			return responseBody.toString();
		} catch (IOException e) {
			throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
		}
	}
}