/**
 * @param {Function} fn
 * @return {Array}
 */
Array.prototype.groupBy = function(fn) {
  const group = {};
  
  for(let val of this){
      const key = fn(val);
      group.hasOwnProperty(key) ? group[key].push(val) : group[key] = [val];
  }
  return group;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */

