const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm83l7u/",
            name: "ssm83l7u",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm83l7u/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序互助学习平台"
        } 
    }
}
export default base
