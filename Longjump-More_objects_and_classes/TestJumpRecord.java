public class TestJumpRecord {

    public static void main(final String[] args){

        System.out.println("Test 1");
        JumpRecord jump = new JumpRecord();
        jump.recordJump(5.6);
        if (jump.jumps() == 1){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 2");
        if (jump.getJumpDistance(1) == 4.5){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }



        System.out.println("Test 3");
        jump.recordJump(5.3);
        if (jump.jumps()== 2 && jump.getLongest() == 2){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        System.out.println("Test 4");
        jump.recordJump(4.8);
        jump.recordJump(4.8);
        jump.recordJump(4.7);
        int g = jump.getLongest();
        if(g == 1 && jump.jumps() == 3 && jump.finished()){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 5");
        jump.recordFoulJump();
        jump.recordFoulJump();
        jump.recordFoulJump();
        if(jump.jumps() == 3 && jump.finished()){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 6");
        jump.recordJump(4.5);
        jump.recordFoulJump();
        jump.recordJump(4.2);
        int f = jump.getLongest();
        if (jump.jumps() == 3 && f == 1 && jump.isFoulJump(2)&& jump.finished()&& jump.foulJumps() == 1  ){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test 7");
        if(jump.maxJumps() == 3){
            System.out.println("Pass");
        }

        else{
            System.out.println("Fail");
        }

    }
}
