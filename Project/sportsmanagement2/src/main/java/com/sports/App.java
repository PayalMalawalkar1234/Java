package com.sports;

public class App {

	public static <Session, SessionFactory> void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Players.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        // Initialize Session Object
        Session session = sessionFactory.openSession();
        
        Player player1 = new Player();
        
        player1.setId(1);
        player1.setFirst_Name("Sachin");
        player1.setLast_Name("Tendulkar");
        player1.setAge(40);
        player1.setaddress("Mumbai");
        player1.setCategory("CricketPlayer");
        
        player1.setId(2);
        player1.setFirst_Name("Abhinav");
        player1.setLast_Name("Bindra");
        player1.setAge(40);
        player1.setaddress("Kolkata");
        player1.setCategory("GolfPlayer");
        
        player1.setId(3);
        player1.setFirst_Name("anup");
        player1.setLast_Name("Kumar");
        player1.setAge(30);
        player1.setaddress("Jaipur");
        player1.setCategory("KabaddiPlayer");
        
        
        
        
        
 
       // session.beginTransaction();
 
        // Here we have used
        // save() method of JPA
      //  session.save(player1);
 
       // session.getTransaction().commit();
    }

 

	}


