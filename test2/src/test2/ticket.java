package test2;

public class ticket {  
    int ticketid;
    int price;
    static int availableTickets;
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getAvailableTickets() {
        return availableTickets;
    }
    public static void setAvailableTickets(int availableTickets) {
        if(availableTickets>0) {
            ticket.availableTickets = availableTickets;
        }
    }    
    public int calculateTicketCost(int nooftickets) {
        if(nooftickets>availableTickets)
            return -1;
        availableTickets=availableTickets-nooftickets;
        return price*nooftickets;
            
        }
    public static void main(String[] args) {
    }
}