public class Student {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;
   
    double getAverageMark()
    {
        return (RE+SDA+SQAT+SEAM+FM)/4;
    }

  
    int getTotal()
    {
        return (RE+SDA+SQAT+SEAM+FM);
    }
    
    void testDisplay()
    {
        System.out.println("Testing...");

    }
   
    void testAll()
 {
     System.out.println("Hello");
     return;
}
    void displayMarks()
{
    System.out.prinltn(RE);
    System.out.prinltn(SDA);
    System.out.prinltn(SQAT);
    System.out.prinltn(SEAM);
    System.out.prinltn(FM);
    }
}
