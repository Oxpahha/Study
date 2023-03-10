import static org.assertj.core.api.Assertions.*;
public class CalculationTest {
    public static void main(String[] args) {
        //manual
        //positive
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(2,2,'+'));
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(2,1,'-'));
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(2,3,'*'));
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(8,2,'/'));
//        //negative
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(8,2,'_'));
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(8,0,'/'));
//        System.out.printf("Резуальтат операции: %s\n",Calculator.calculation(992342324,5555,'*'));

        //primitive
        //positive
//        if (8!= Calculator.calculation(2,6,'+')){
//            throw new AssertionError("Method error");
//        }
//        if (0!= Calculator.calculation(2,2,'-')){
//            throw new AssertionError("Method error");
//        }
//        if (6!= Calculator.calculation(2,3,'*')){
//            throw new AssertionError("Method error");
//        }
//        if (2!= Calculator.calculation(10,5,'/')){
//            throw new AssertionError("Method error");
//        }

//        try {
//            Calculator.calculation(8,4,'_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Unexpected operator")){
//                throw new AssertionError("Method error");
//            }


        //assert
        //positive
//        assert 8 == Calculator.calculation(2,6,'+');
//        assert 0 == Calculator.calculation(2,2,'-');
//        assert 6 == Calculator.calculation(2,3,'*');
//        assert 2 == Calculator.calculation(10,5,'/');
        //negative
//        assert 2 == Calculator.calculation(10,2,'/');


        //assertJ
        //positive
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 3, '*')).isEqualTo(6);
        assertThat(Calculator.calculation(10, 5, '/')).isEqualTo(2);

        assertThatThrownBy(() -> Calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
        //negative
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(9);
        assertThat(Calculator.calculation(10, 2, '/')).isEqualTo(2);




    }
}


