import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingService {
    private List<Train> trainList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();

    public BookingService() {
        trainList.add(new Train(100,"Vande Bhart Express","Delhi","Muzaffarpur",100));
        trainList.add(new Train(101,"Tejas Express","Ghaziabad","Patna",10));
        trainList.add(new Train(102,"Vaishali Express","New Delhi","Patliputra",60));
        trainList.add(new Train(103,"North East Express","Anand Vihar Terminal","Danapur",70));
        trainList.add(new Train(104,"Garbrath Express","Delhi","Goa",90));
        trainList.add(new Train(105,"Samarkranti Express","Agra","Mumbai",85));
    }

    //Date
    public List<Train> searchTrain(String source,String destination) {
        List<Train> res = new ArrayList<>();
        for (Train train:trainList){
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
                res.add(train);
            }
        }
        return res;
    }

    public Ticket bookTicket( User user,int trainId,int seatCount) {
        for (Train train:trainList) {
            if (train.getTrainId()==trainId) {
                if (train.bookSeats(seatCount)) {
                    Ticket ticket = new Ticket(user,train,seatCount);
                    ticketList.add(ticket);
                    return ticket;
                }
                else {
                    System.out.println("No enough seats available");
                    return null;
                }
            }
        }
        System.out.println("Train ID not found");
        return null;
    }

    public List<Ticket> getTicketByUser(User user) {
        List<Ticket> res = new ArrayList<>();
        for (Ticket ticket:ticketList) {
            if(ticket.getUser().getUserName().equalsIgnoreCase(user.getUserName()))
            {
                res.add(ticket);
            }
        }
        return res;
    }

    public boolean cancelTicket(int ticketId ,User user ){
        Iterator<Ticket> iterator = ticketList.listIterator();
        while (iterator.hasNext()) {
            Ticket ticket =iterator.next();
            if (ticket.getTicketId()==ticketId &&
                        ticket.getUser().getUserName().equalsIgnoreCase(user.getUserName()))
            {
                Train train =ticket.getTrain();
                train.cancelSeats(ticket.getSeatBooked());
                iterator.remove();
                System.out.println("Ticket "+ticketId+" cancelled Successfully");
                return true;
            }
        }

        System.out.println("Ticket not found or does not belong to current user");
        return false;
    }

    public void listAllTrains( ){
        System.out.println("List of all trains: ");
        for (Train train:trainList) {
            System.out.println(train);
        }
    }
}
