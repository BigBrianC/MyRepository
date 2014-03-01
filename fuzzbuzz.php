<?php 
for($i=1;$i <= 100;$i++){ 
if($i%3 == 0 && $i%5 == 0){ 
echo 'fuzzbuzz</br>'; 
}elseif($i%3==0){ 
echo 'fuzz</br>'; 
}elseif($i%5==0){ 
echo 'buzz</br>'; 
}else{ 
echo $i . '</br>';  
}
}

?>