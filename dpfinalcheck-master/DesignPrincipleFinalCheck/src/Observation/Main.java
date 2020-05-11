package Observation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer puru=new Admin("Shreya");
		Observer dc=new Admin("Saima");
		Observer rahul=new Admin("Akshita");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(shreyaa);
		notificationService.addSubscriber(sam);
		notificationService.addSubscriber(Akshita);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(shreyaa);
		
		

	}

}
