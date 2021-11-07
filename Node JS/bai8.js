var person = {
    ho : "Truong",
    ten : "Hieu",
    chaomung : function() {
        console.log("chao ban "+this.ho+" "+this.ten);
    }
}
person.chaomung();
console.log(person["ten"]);