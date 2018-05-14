// { autofold

package generics.util;

import generics.cake.Cake;
import generics.cake.ChocolateCake;
import generics.cake.StuffedChocolateCake;
import generics.cake.VanillaCake;
import org.junit.Test;

// }

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UnionUtilTest {



//    @Test
//    public void unionOfChocolateCakes() throws Exception {
//        List<ChocolateCake> firstList = Arrays.asList(new ChocolateCake(1), new ChocolateCake(3));
//        List<ChocolateCake> secondList = Arrays.asList(new ChocolateCake(2), new ChocolateCake(20));
//
//        assertThat(UnionUtil.union(firstList, secondList))
//                  .containsExactly(new ChocolateCake(1), new ChocolateCake(3), new ChocolateCake(2), new ChocolateCake(20));
//    }
//
//    @Test
//    public void unionOfChocolateCakesAndStuffedChocolateCakes() throws Exception {
//        List<ChocolateCake> firstList = Arrays.asList(new ChocolateCake(1), new ChocolateCake(3));
//        List<StuffedChocolateCake> secondList = Arrays.asList(new StuffedChocolateCake(2), new StuffedChocolateCake(20));
//        assertThat(UnionUtil.union(firstList, secondList))
//                  .containsExactly(new ChocolateCake(1), new ChocolateCake(3), new StuffedChocolateCake(2), new StuffedChocolateCake(20));
//    }
//
//    @Test
//    public void unionOfStuffedChocolateCakesAndChocolateCakes() throws Exception {
//        List<StuffedChocolateCake> firstList = Arrays.asList(new StuffedChocolateCake(1), new StuffedChocolateCake(3));
//        List<ChocolateCake> secondList = Arrays.asList(new ChocolateCake(2), new ChocolateCake(20));
//        assertThat(UnionUtil.union(firstList, secondList))
//                  .containsExactly(new StuffedChocolateCake(1), new StuffedChocolateCake(3), new ChocolateCake(2), new ChocolateCake(20));
//    }
//
//    @Test
//    public void unionOfStuffedChocolateCakesAndChocolateCakes_andThenUnionWithVanillaCakes() throws Exception {
//        List<StuffedChocolateCake> firstList = Arrays.asList(new StuffedChocolateCake(1), new StuffedChocolateCake(3));
//        List<ChocolateCake> secondList = Arrays.asList(new ChocolateCake(2), new ChocolateCake(20));
//        List<VanillaCake> thirdList = Arrays.asList(new VanillaCake(11), new VanillaCake(22));
//
//        assertThat(UnionUtil.union(UnionUtil.union(firstList, secondList), thirdList))
//                  .containsExactly(new StuffedChocolateCake(1), new StuffedChocolateCake(3), new ChocolateCake(2), new ChocolateCake(20),
//                        new VanillaCake(11), new VanillaCake(22));
//    }
//
//    @Test
//    public void unionOfStuffedChocolateCakesAndChocolateCakes_andThenUnionWithVanillaCakes_nowWithVariables() throws Exception {
//        List<StuffedChocolateCake> firstList = Arrays.asList(new StuffedChocolateCake(1), new StuffedChocolateCake(3));
//        List<ChocolateCake> secondList = Arrays.asList(new ChocolateCake(2), new ChocolateCake(20));
//        List<VanillaCake> thirdList = Arrays.asList(new VanillaCake(11), new VanillaCake(22));
//
//        List<ChocolateCake> chocolateUnion = UnionUtil.union(firstList, secondList);
//        List<Cake> fullUnion = UnionUtil.union(chocolateUnion, thirdList);
//        assertThat(fullUnion)
//                .containsExactly(new StuffedChocolateCake(1), new StuffedChocolateCake(3), new ChocolateCake(2), new ChocolateCake(20),
//                        new VanillaCake(11), new VanillaCake(22));
//    }
}