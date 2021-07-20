import java.util.*;
public class UniqueAlphabet{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = sc.nextInt();
        HashSet<Character> set = new HashSet();
        int count = 0;
        char tem='\0';
        s=s.toLowerCase();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)!=' ')
            set.add(s.charAt(i));
            if(set.size()==num&&count==0){
                tem = s.charAt(i);
                count++;

            }

        }
        System.out.println(tem);

    }
}