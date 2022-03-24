public class demo {
    public static void main(String[] args) {
        int a1[]={1,2,3,4};
        int a2[]={4,5,3,9};
        int a3[]={1,3,4,6};
        int a4[]={6,8,3,4};
        int a5[]={6,2,7,4};

        System.out.println(compare(a1,a2,a3,a4,a5));
        System.out.println(" ");

    }

    static int compare(int a1[],int a2[],int a3[],int a4[],int a5[]){
        int s1=function(a1,a2);
        System.out.println(s1);

        int s2=function(a1,a3);
        System.out.println(s2);

        int s3=function(a1,a4);
        System.out.println(s3);

        int s4=function(a1,a5);
        System.out.println(s4);

        return Math.max(Math.max(Math.max(s1,s2),s3),s4);
    }

    static int function(int arr1[],int arr2[]){
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i]*arr2[i];
        }

        return sum;

    }
}
