public class selectionSorting {
    public static void main(String[] args) {
    int a[]= {5,66,789,112,7,63,16,36,11,22,33},r,c,temp,pos;
    for(r=0;r<a.length-1;r++){
        pos=r;
        for(c=r+1;c<a.length;c++){
            if(a[pos]>a[c]){
                pos=c;
            }
        }
        if(pos!=r){
            temp=a[pos];
            a[pos]=a[r];
            a[r]=temp;
        }
    }

    for(r=0;r<a.length;r++)
    System.out.println(a[r]);


    }
}
