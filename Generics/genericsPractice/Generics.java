package genericsPractice;

class Sample <T> {
    public <T> void sampleMethod(T[] item){
        for(T i: item){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Generics {
	public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Sample<Integer> samInt = new Sample<>();
        samInt.sampleMethod(arr1);
        
        String[] arr2 = {"Shiva >", "Hemanth >", "Chandra >", "Lokesh >", "Pavan"};
        Sample<Integer> samStr = new Sample<>();
        samStr.sampleMethod(arr2);
        
        Character[] arr3 = {'A', 'E', 'I', 'O', 'U'};
        Sample<Integer> samChar = new Sample<>();
        samChar.sampleMethod(arr3);
    }
}
