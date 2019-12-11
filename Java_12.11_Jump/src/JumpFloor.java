
public class JumpFloor {
    public int jump(int target){
        if(target==1)
        {
            return 1;

        }
        if(target==2)
        {
            return 2;
        }

        return jump(target-1)+jump(target-2);
    }

    public int jump2(int target){
        int x=1,y=2,z=0;
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        for(int i=3;i<=target;i++){
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }
}

