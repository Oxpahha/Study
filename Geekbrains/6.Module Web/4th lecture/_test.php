<?php
$name = 'Alex';
$job = 'QA';
$city = 'Sochi';
$email = 'abc@gmail.com';
$phone = 88005553535;
$age = 'Возраст';
$agen = 2023-1993;
$aged = $agen*365;

$skills = [
	'skill' => ["aboba", "phots", "paint", "med"],
	'proc' => [20, 30, 50, 80]
    ];
$jobs = [
	'job_name' => ["Pinguin flipper", "Alone mother", "Drug diller"],
	'job_date' => ["Mar 2023", "Aug 2001 - Sep 2022", "Apr 1992 - Jun 1999"],
    'job_discr' => ["Do a barrel roll", "Feed", "I cant tell u"]
    ];    


	
class User {
	public $name;
	public $day;

	public function show()
	{
		echo $this->name, ' ', $this->day;
	}
}

$usera = new User;
$usera->name = 'TestName';
$usera->day = 10;
$usera->show();

?>
