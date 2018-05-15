// { autofold

package generics.util;

import generics.cake.Cake;
import generics.cake.ChocolateCake;
import generics.cake.StuffedChocolateCake;
import generics.cake.VanillaCake;

// }

import java.util.ArrayList;
import java.util.List;

public class SwapUtil {

    public static Object[] swapElements(Object[] array, int firstIndex, int secondIndex) {
        Object[] copyOfArray = new Object[array.length];
        System.arraycopy(array, 0, copyOfArray, 0, array.length);

        copyOfArray[firstIndex] = array[secondIndex];
        copyOfArray[secondIndex] = array[firstIndex];

        return copyOfArray;
    }
}
