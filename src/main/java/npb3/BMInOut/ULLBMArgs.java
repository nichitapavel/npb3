package npb3.BMInOut;


public class ULLBMArgs extends BMArgs {

    public static String outOfMemoryMessageULL(){
        StringBuilder str = new StringBuilder();

        str.append( "The java maximum heap size is to small to run this benchmark class");
        str.append("To allocate more memory, use the -mxn option where n is the number of bytes to be allocated");

        return str.toString();
    }

    public static String BannerULL(String BMName, char clss, boolean serial, int np){
        StringBuilder str = new StringBuilder();

        str.append(" NAS Parallel Benchmarks Java version (NPB3_0_JAV)");
        if(serial) str.append(" Serial Version "+BMName+"."+clss);
        else str.append(" Multithreaded Version "+BMName+"."+clss+ " np="+np);

        return str.toString();
    }
}
