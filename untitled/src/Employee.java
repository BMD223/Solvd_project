public class Employee extends User{
    int ID;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public Employee(String name, String surname, String email, int id) {
        super(name,surname,email);
        ID=id;  
    }

    void addToBookings(String ticketCode,Booking b){
        if(b.count<b.st.ven.capacity){
            b.count++;
            b.BookedTickets.add(ticketCode);
        }else{
            System.out.println("Venue full, sorry!");
        }
    }
    void returnTicket(String ticketCode,Booking b){
        if(b.count>0){
            b.count--;
            b.BookedTickets.remove(ticketCode);
        }
    }
}
