public class TestSort {
    public static void main(String[] args) {

        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length - i; j++) {
                        if (array[j-1]> array[j]){
                            int temp = array[j]; //tymczasowe miejsce
                            array[j] = array[j-1];
                            array[j-1] = temp;
                    }
                    }
                }
            }
        };
        int[] tab ={5,10,30,2,4,1,-20,15};
        printTab(tab);
        sorter.sort(tab);
        printTab(tab);
    }
     static void printTab(int[] array){
        for (int value : array){
            System.out.print(value +" ");
        }
        System.out.println();
    }
    private interface Sortable{
        void sort(int[] array);
    }
}