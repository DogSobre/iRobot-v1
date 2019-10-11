package DogSobre_Industries;

class Robot implements MoveFunction, RobotDisplayFunctions, RobotActionFunction {

    private String name;

    public void moveForward(float Var1) {
        boolean a = setMoveForward(true);
        boolean b = setMoveBack(false);
        while (a && b){
            this.moveForward(10f);
            if (a && b){

            }
        }
    }
    private boolean setMoveForward(boolean a) {
        return a;
    }

    public void moveBack(float Var1) {
        boolean a = setMoveForward(false);
        boolean b = setMoveBack(true);
        while (a && b){
            this.moveBack(10f);
        }
    }
    private boolean setMoveBack (boolean b){
        return b;
    }

    public void moveRight(float Var1) {
        boolean c = setMoveRight(true);
        boolean d = setMoveLeft(false);
    }
    private boolean setMoveRight(boolean c) {
        return c;
    }
    public void moveLeft(float Var1) {
        boolean c = setMoveRight(false);
        boolean d = setMoveLeft (true);
    }
    private boolean setMoveLeft(boolean d){
        return d;
    }

    public void jump(float Var1) {

    }
    public void setRobotName(String n) {
        this.name = n ;
    }
    public String getRobotName() {
        return this.name;
    }
}