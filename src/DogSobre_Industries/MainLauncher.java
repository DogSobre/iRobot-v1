package DogSobre_Industries;

class MainLauncher {



    public static void main(String[] args){

        Command cmd1 = new Command("Walk", 100, System.currentTimeMillis());

        System.out.println( cmd1.getName() );
        System.out.println( cmd1.getMaxDuration() );
        System.out.println( cmd1.isFinished() );

        try{
            Thread.sleep(1900);
        }
        catch(Exception e) {


        }
        System.out.println( cmd1.getElapsedDuration() );
        System.out.println( cmd1.isFinished() );

        CommandMNGR cmdMgr = new CommandMNGR();
        cmdMgr.addCommand("coucou", 12000);
    }


}