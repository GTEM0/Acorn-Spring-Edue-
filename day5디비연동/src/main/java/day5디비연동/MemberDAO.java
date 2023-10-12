package day5디비연동;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class MemberDAO {
    @Autowired
    DataSource ds;

    public int updateUser(Member member) {
        int rowCnt = 0;
        String sql = "update member_acorn " +
                     "set pwd = ?, name = ?, email = ?, birth = ?, sns = ?, reg_date = ? " +
                     "where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, member.getPwd());
            pstmt.setString(2, member.getName());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, member.getBirth());
            pstmt.setString(5, member.getSns());
            pstmt.setTimestamp(6, new java.sql.Timestamp(member.getReg_date().getTime()));
            pstmt.setString(7, member.getId());
            rowCnt = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        } finally {
            close(pstmt, conn);
        }
        return rowCnt;
    }

    private void close(AutoCloseable... acs) {
        for (AutoCloseable ac : acs) {
            try {
                if (ac != null) {
                    ac.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
