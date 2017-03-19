package nl.hu.iac.service;


public class ServiceProvider {
	private static WindMolenServiceImpl windMolenService = new WindMolenServiceImpl();
	public static WindMolenServiceImpl getWindMolenService() {
		return windMolenService;
	}
}