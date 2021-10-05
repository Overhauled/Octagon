function solution(answers) {
    let supo1 = [1,2,3,4,5];
    let supo2 = [2,1,2,3,2,4,2,5];
    let supo3 = [3,3,1,1,2,2,4,4,5,5];
    let count = [0,0,0];

    for(let i=0; i<answers.length; i++) {
        if(supo1[i % supo1.length] === answers[i]) {
            count[0]++;
        };
        if(supo2[i % supo2.length] === answers[i]) {
            count[1]++;
        };
        if(supo3[i % supo3.length] === answers[i]) {
            count[2]++;
        };
    };

    let supoja = Math.max(...count);
    let result = [];
    for (let j=0; j<count.length; j++) {
        if(count[j] === supoja) {
            result.push(j+1);
        };
    };
    return result;
};