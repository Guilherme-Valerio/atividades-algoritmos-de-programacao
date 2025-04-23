## <b>Atividade Reformulação do Código - 15/04/25<br></b>
### Alunos:<br>
`Alberto Souza`<br>
`Amanda Santos`<br>
`Gabriel Martins` <br>
`Guilherme Valerio`<br>
`Victor Marques`<br>
`Vitor Siqueira`<br>
### Código Antigo:<br>
```
public class ArrayCopier {
    public static void main(String[] arguments) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        float[] array2 = new float[array1.length];
        
        System.out.print("array1: [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("array2: [ ");
        int count = 0;
        while (count < array1.length && array1[count] != 1) {
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
        System.out.println("]");
    }
}
```
### Código Reformulado:<br>
```
public class ArrayCopier {
    public static void main(String[] args) {
    int[] array1 = {7, 4, 8, 1, 4, 1, 4};
    float[] array2 = new float[array1.length];
    int count = 0;
    System.out.print("array1: [ ");
    while (count < array1.length + array2.length) {
        if (count < array1.length) {
            System.out.print(array1[count] + " ");
            count++;
        } else {
            if (count == array1.length) {
                System.out.println(" ]");
                System.out.print("array2: [ ");
            }
            int count2 = count - array1.length;
            if (array1[count2] == 1) {
                break;
            }
            array2[count2] = (float) array1[count2];
            System.out.print(array2[count2] + " ");
            count++;
        }
    }
    System.out.println(" ]");
    }
}
```
