package sist.com.obj.core4;

public class ServiceMain {

	public static void main(String[] args) {
		ClientService clientService = new ClientService(new JdbcDao());
		AdminService adminService = new AdminService(new FrameWorkDao());
		clientService.fileUpload();
		adminService.fileUpload();
		System.out.println();
		
		MarketingService marketingService = new MarketingService(new ManDao());
		MapService mapService = new MapService(new FrameWorkDao());
		marketingService.fileUpload();
		mapService.fileUpload();
	}
}
