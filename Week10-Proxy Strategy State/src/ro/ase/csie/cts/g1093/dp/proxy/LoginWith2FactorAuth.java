package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginWith2FactorAuth implements LoginModuleInterface{

	
	LoginModuleInterface loginModule=null;
	@Override
	public boolean login(String username, String pass) {
	if (this.loginModule.login(username, pass))
		System.out.println("Please input the generate code thatr you have receivesdxd");
	System.out.println("Check received code");
	if (checkGeneratedCode(1245))
		System.out.println("Hello"+username);
	return false;
	}
	public boolean checkGeneratedCode(int code) {
	   if (code==1245)
	   {
		   return true;
	   }
		   else
			   return false;
	}

	@Override
	public boolean checkServerStatus() {
	return this.loginModule.checkServerStatus();	
	}

	
}
