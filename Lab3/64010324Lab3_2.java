import java.util.*;
class Pro2{
    public static int k=0,len1,len2;
    public static int[] merge(int[] list1,int[] list2){
        int[] ans=new int[2000];
        int i=0,j=0;
        while(i<len1 && j<len2){
            if(list1[i]<list2[j]) ans[k++]=list1[i++];
            else ans[k++]=list2[j++];
        }
        while(i<len1) ans[k++]=list1[i++];
        while(j<len2) ans[k++]=list2[j++];
        return ans;
    }
    public static void main(String args[]){
        int[] list1=new int[1000],list2=new int[1000],ans=new int[2000];
        Scanner in=new Scanner(System.in);
        String[] s;
        System.out.print("Enter list1: ");
        s = in.nextLine().split(" ");
        for(int i=0;i<s.length;i++) list1[i]=Integer.parseInt(s[i]);
        len1=s.length;
        System.out.print("Enter list2: ");
        s = in.nextLine().split(" ");
        for(int i=0;i<s.length;i++) list2[i]=Integer.parseInt(s[i]);
        len2=s.length;
        ans=merge(list1,list2);
        System.out.print("The merged list is ");
        for(int i=0;i<k;i++){
            System.out.print(ans[i]+" ");
        }
    }
}