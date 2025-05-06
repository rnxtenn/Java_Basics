package Java_Basics;

public class CharacterOccurances {
    int Max_Character =255;
    CharacterOccurances(String str){
        int Count[]= new int[Max_Character];
        int len = str.length();
        System.out.print("Strings Are: ");
        for(int i=0;i<len;i++){
            Count[str.charAt(i)]++;
            System.out.print(str.charAt(i)+" ");
        }
        char ch[]= new char[str.length()];
        for (int i=0;i<len;i++){
            ch[i]=str.charAt(i);
            int find = 0;
            for (int j = 0;j<i;j++){
                if (str.charAt(i)==ch[j]){
                    find++;
                }
            }
            if(find == 1){
                System.out.println("\n Number of Occurances:"+str.charAt(i)+" is :"+Count[str.charAt(i)]);
            }
        }

    }
    public static void main(String[] args){
        new CharacterOccurances("Rahul Raja");
    }
}
// we can also do this, using method but using constructor is easy to implement and it is quite fast.