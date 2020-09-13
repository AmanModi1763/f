
import java.util.ArrayList; 
import java.util.Arrays;
public class ArrayList1{
    public static void main(String[] args){
        System.out.println(getListOfFactors(9));
        System.out.println(getListOfFactors(23));
        System.out.println(getListOfFactors(50));
        System.out.println(getListOfFactors(100));
        System.out.println(getListOfFactors(762));
        ArrayList<Integer> nums = new ArrayList<Integer> (Arrays.asList(2, 3, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79));
        keepOnlyCompositeNumbers(nums);
    }
    public static ArrayList<Integer> getListOfFactors(int number){
        int startNum = 2; 
        ArrayList<Integer> factors = new ArrayList<Integer>();
        while(startNum < number){
            if(number % startNum == 0){
                factors.add(startNum);
            }
            startNum++;
        }
        
        return factors;
    }
    public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums ){
        int i = 0;
        int numDivisor = 0; boolean state = false;
        while(i < nums.size())
        {
            if(nums.get(i) <= 2)
            {
                nums.remove(i); 
            }else{
                for(int j = 2; j < nums.get(i); j ++){
                    if(nums.get(i) % j == 0){
                        state = true;
                    }
                }
            }
            if(state == true){
                i++;
            }else{
               nums.remove(i);
            }
                numDivisor = 0;
                state = false;
        }
        System.out.println(nums);
    }
    public static boolean checkComposite(int x){
        if(x <= 2)
            return false;
            
        for(int j = 2; j < x; j++){
            if(x % j == 0)
                return true;
        }
        
        return false;
    }    
}