package helperMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import config.DefineConstants;

public class DatabaseUtils {

	public static void enable_ContactSetting() {
		String sql = "delete from dbo.ContactMergeConfiguration where userinfouserid=1";

		try (Connection conn = DriverManager.getConnection(DefineConstants.jdbcUrl, DefineConstants.db_UserName,
				DefineConstants.db_Password); Statement stmt = conn.createStatement();) {
			stmt.executeUpdate(sql);
			System.out.println("Record deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void clearEmailVerificationsSetting() {
		String sql = "delete from dbo.EmailVerifyProviderSetting where userinfouserid=1";

		try (Connection conn = DriverManager.getConnection(DefineConstants.jdbcUrl, DefineConstants.db_UserName,
				DefineConstants.db_Password); Statement stmt = conn.createStatement();) {
			stmt.executeUpdate(sql);
			System.out.println("Record deleted successfully for Email Verification Settings");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void clearSpamScoreSetting() {
		String sql = "delete from dbo.MailSpamScoreVerifySetting where userinfouserid=1";

		try (Connection conn = DriverManager.getConnection(DefineConstants.jdbcUrl, DefineConstants.db_UserName,
				DefineConstants.db_Password); Statement stmt = conn.createStatement();) {
			stmt.executeUpdate(sql);
			System.out.println("Record deleted successfully for Spam Score Settings");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] ar) {
//		DatabaseUtils.clearSpamScoreSetting();
		DatabaseUtils.clearEmailVerificationsSetting();
	}

}
