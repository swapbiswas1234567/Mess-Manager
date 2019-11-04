package mess.manager;

public class DateComparator {

    public DateComparator() {
    }
    
    public static int dateCompare(String d1, String d2){
        char a1[] = d1.toCharArray();
        char a2[] = d2.toCharArray();
        
        int day1 = 0, day2 = 0, month1 = 0, month2 = 0, year1 = 0, year2 = 0;
        
        for(int i=0; i<4; i++){
            year1 = year1*10 + ((int)a1[i]) - 48;
            year2 = year2*10 + ((int)a2[i]) - 48;
        }
        
        for(int i=5; i<7; i++){
            month1 = month1*10 + ((int)a1[i])-48;
            month2 = month2*10 + ((int)a2[i])-48;
        }
        
        for(int i = 8; i<10; i++){
            day1 = day1*10 + ((int)a1[i])-48;
            day2 = day2*10 + ((int)a2[i])-48;
        }
        
        System.out.println(year1 + "-" + month1 + "-" + day1);
        System.out.println(year2 + "-" + month2 + "-" + day2);
        
        if(day1==day2 && month1==month2 && year1==year2)    return 0;
        
        if(year1 > year2)   return 1;
        else if(year1 < year2)  return -1;
        else{
            if(month1 > month2) return 1;
            else if(month1 < month2)    return -1;
            else{
                if(day1 > day2) return 1;
                else    return -1;
            }
        }
    }
}
