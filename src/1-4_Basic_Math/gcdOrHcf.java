/*
lcm = (a*b)/gcd(a,b)
TC:O(min(a,b)
SC:O(1)
 */
class gcdOrHcf {
    static Long getGcd(Long a,Long b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }
    static Long[] lcmAndGcd(Long a , Long b) {
        Long ta = a;//temporary assigning as either a or b becomes 0.
        Long tb = b;
        Long gcd = getGcd(a,b);
        Long lcm = (ta*tb)/gcd;
        return new Long[]{lcm,gcd};
    }
};