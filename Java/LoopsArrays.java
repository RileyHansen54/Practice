public class LoopsArrays {
    public static void main (String[] args){



        String[] list = new String[3];

        for (int i=0; i< list.length;i++){
            switch(i){
                case 0:
                    list[i] = "red"; break;
                case 1:
                    list[i] = "blue"; break;
                case 2:
                    list[i] = "green"; break;
            }
            System.out.println(list[i]);
        }

        for (String item : list){
            System.out.println(item);
            //cannot change val but can access methods and items
        }

    }
}
