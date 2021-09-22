var twoSum = function(nums, target) {
    let map=new Map();
    let res = [];
    for (let index = 0; index < nums.length; index++) {
        if(map[target-nums[index]]!=null){
            res[0]=map[target-nums[index]];
            res[1]=index;
        }else{
            map[nums[index]] = index;     
        }
    }
    return res;    
};

let nums=[1,3,2,7];
let target = 9;
let res = twoSum(nums,target);
console.log(res);