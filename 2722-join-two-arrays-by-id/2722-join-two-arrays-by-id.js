/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let map = new Map();
    
    for(let obj of arr1){
        map.set(obj.id, obj)
    }

    for(let obj of arr2){
        if(!map.has(obj.id)){
            map.set(obj.id, obj)    
        } else {
            const lastObj = map.get(obj.id)
            for(const key of Object.keys(obj)){
                lastObj[key] = obj[key]
            }
        }
        
    }
    
    const result = new Array()
    for(let key of map.keys()){
        result.push(map.get(key))
    }
    return result.sort((a, b) => a.id - b.id)
};