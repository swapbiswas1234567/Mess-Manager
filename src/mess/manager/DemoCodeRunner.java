package mess.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DemoCodeRunner extends javax.swing.JFrame {

    PreparedStatement psmt = null;
    ResultSet rs = null;
    Connection conn = null;
    
    private void init(){
        conn = JConnection.ConnecrDb();
        sInputInserter();
        storeInserter();
    }
    
    public DemoCodeRunner() {
        initComponents();
        
        init();
    }
    
    
    
    private void storeInserter(){
        try{
            psmt = conn.prepareStatement("Alter Table store Add itemserial integer");
            psmt.execute();
            psmt.close();
        }catch(Exception e){
            System.out.println("Store Column Add Error");
            return;
        }
        
        try{
            psmt = conn.prepareStatement("Update store set itemserial = 1");
            psmt.execute();
            psmt.close();
        }catch(Exception e){
            System.out.println("Store Insert Error");
            return;
        }
        System.out.println("Store Insert Doone!");
    }
    
    
    private void sInputInserter(){
        ArrayList <SInput> a = new ArrayList<>();
        try{
            psmt = conn.prepareStatement("Select itemname, curdate,amount,price,available,avgprice FROM storeinput");
            rs = psmt.executeQuery();
            int count = 1;
            
            while(rs.next()){
                PreparedStatement ps = conn.prepareStatement("SELECT avgprice , available from store where itemname = ?");

                SInput s = new SInput(  rs.getString(1),rs.getString(2), rs.getDouble(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6),-1.0,-1.0,1,"N", count++   );
                a.add(s);
            }
            
            psmt.close();
            rs.close();
        }catch(Exception e){
            System.out.println("Store Input Copy Error");
            return;
        }
        
        try{
            psmt = conn.prepareStatement("DELETE FROM storeinput");
            psmt.execute();
            psmt.close();
        }catch(Exception e){
            System.out.println("Store Input Delete Error");
            return;
        }
        
        try{
            String s = "ALTER TABLE storeinput ADD previousavailable REAL;";
            psmt = conn.prepareStatement(s);
            psmt.execute();
            psmt.close();
            s = "ALTER TABLE storeinput ADD previousavgprice REAL;";
            psmt = conn.prepareStatement(s);
            psmt.execute();
            psmt.close();
            s = "ALTER TABLE storeinput ADD itemserial INTEGER;";
            psmt = conn.prepareStatement(s);
            psmt.execute();
            psmt.close();
            s = "ALTER TABLE storeinput ADD status TEXT;";
            psmt = conn.prepareStatement(s);
            psmt.execute();
            psmt.close();
            s = "ALTER TABLE storeinput ADD serial INTEGER;";
            psmt = conn.prepareStatement(s);
            psmt.execute();
            psmt.close();
        }catch(Exception e){
            System.out.println("Store Input Column add error");
            return;
        }
        
        try{
            psmt = conn.prepareStatement("INSERT INTO `storeinput`(`itemname`, `curdate`, `amount`, `price`, available, avgprice, previousavailable, previousavgprice, itemserial, status, serial) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            int len = a.size();
            
            for(int i=0; i<len; i++){
                psmt.setString(1, a.get(i).itemname);
                psmt.setString(2, a.get(i).curdate);
                psmt.setDouble(3, a.get(i).amount);
                psmt.setDouble(4, a.get(i).price);
                psmt.setDouble(5, a.get(i).availablle);
                psmt.setDouble(6, a.get(i).avgprice);
                psmt.setDouble(7, a.get(i).previosavailable);
                psmt.setDouble(8, a.get(i).previousavgprice);
                psmt.setInt(9, a.get(i).itemserial);
                psmt.setString(10, a.get(i).status);
                psmt.setInt(11, a.get(i).serial);
                psmt.execute();
            }
            
            psmt.close();
        }catch(Exception e){
            System.out.println("Store Input Insert Error");
            return;
        }
        
        System.out.println("Store Input Correction Done!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoCodeRunner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}



class SInput{
    String itemname, curdate;
    Double amount,price,availablle,avgprice,previosavailable, previousavgprice;
    int itemserial;
    String status;
    int serial;

    public SInput() {
    }

    public SInput(String itemname, String curdate, Double amount, Double price, Double availablle, Double avgprice, Double previosavailable, Double previousavgprice, int itemserial, String status, int serial) {
        this.itemname = itemname;
        this.curdate = curdate;
        this.amount = amount;
        this.price = price;
        this.availablle = availablle;
        this.avgprice = avgprice;
        this.previosavailable = previosavailable;
        this.previousavgprice = previousavgprice;
        this.itemserial = itemserial;
        this.status = status;
        this.serial = serial;
    }
    
}