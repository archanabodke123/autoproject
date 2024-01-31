package autoproject;

public class TestCaseExecutor {
	
	public static void main(String[] args) {
		NegativeLoginTestCases.verify_password_is_require_when_user_enter_no_password();
		NegativeLoginTestCases.verify_username_is_require_when_user_enter_no_username();
		NegativeLoginTestCases.verify_username_is_require_when_user_enter_no_username_and_password();
		NegativeLoginTestCases.verify_when_user_enter_invalid_username_and_password();
	}

}
