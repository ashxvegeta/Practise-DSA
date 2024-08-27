public class totalcostOfgst {
    public static void main(String[] args) {
        
        float pen = 10;
        float pencil = 20;
        float eraser = 30;
        float gst = 0.18f;

        float totalprice =  pen+pencil+eraser;
        float costwithgst = totalprice+(gst*totalprice);
        System.out.println(costwithgst);
    }
}
