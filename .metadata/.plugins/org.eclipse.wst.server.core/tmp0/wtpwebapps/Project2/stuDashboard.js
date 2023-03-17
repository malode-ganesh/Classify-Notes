/**
 * 
 */
function funYear() {
	var x = document.getElementById("year").value;
	alert("Selected " + x);
}

var course = document.getElementById("c").value;
console.log("Course ==" + course);


//Verify Course 

function courseContent(c) {
	let course = c;

	if (course == "bca") {
		return
	}


}



function select1() {
	var s1 = document.getElementById("sel1");
	var s2 = document.getElementById("sel2");

	s2.innerHTML = "";

	var op = document.createElement("option");
	op.innerHTML = "--Select--";
	s2.options.add(op);

	if (s1.value == "fy") {
		var optionArray = [1, 2];
	}
	if (s1.value == "sy") {
		var optionArray = [3, 4];
	}
	if (s1.value == "ty") {
		var optionArray = [5, 6]
	}

	for (var option in optionArray) {

		var newOption = document.createElement("option");
		console.log(optionArray[0]);

		newOption.value = optionArray[option];
		newOption.innerHTML = optionArray[option];
		s2.options.add(newOption);
	}
}

function select2() {

	var sel2 = document.getElementById("sel2").value;
	var sub = document.getElementById("sub");
	sub.innerHTML = "";

	var op = document.createElement("option");
	op.innerHTML = "--Select--";
	sub.options.add(op);
	console.log("s2 value  :" + sel2);

	var optionArr = null;

	//verify course-bca/bba/mba		

	if (course == "bca") {
		if (sel2 == 1) {
			optionArr = ["FC", "OA", "C", "Statistics", "English"];
		} else if (sel2 == 2) {
			optionArr = ["Tally", "OB", "Web Tech", "E-com", "Corporate English"];
		} else if (sel2 == 3) {
			optionArr = ["C++", "OS", "DBMS", "Multimedia", "NA"];
		} else if (sel2 == 4) {
			optionArr = ["Java", "DSA", "RDBMS", "CG", "LR"];
		} else if (sel2 == 5) {
			optionArr = ["SAAD", "PHP", "MAD", "CN", "Linux"];
		} else if (sel2 == 6) {
			optionArr = ["Software Engg", "Python", "WP", "Cyber Security", "Project"];
		}
	} else if (course == "bba") {
		//add BBA subject
		optionArr = ["bba s1", "bba s2"];
	} else if (course == "mca") {
		//add MCA subject
		optionArr = ["mca s1", "mca s2", "mca s3"];
	}

	console.log("arr:->" + optionArr);
	for (x in optionArr) {

		var newOption = document.createElement("option");

		newOption.value = optionArr[x];
		newOption.innerHTML = optionArr[x];

		console.log("Sub name " + optionArr[x]);
		sub.options.add(newOption);
	}

}