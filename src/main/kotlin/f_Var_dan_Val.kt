//Kata kunci var di Kotlin digunakan untuk mendeklarasikan variabel yang nilainya dapat berubah
//sepanjang program dieksekusi. Sedangkan kata kunci val digunakan untuk mendeklarasikan
//variabel konstan yang nilainya tidak akan berubah selama program dieksekusi

//Contoh kode program menggunakan val variabel:
fun main(args: Array<String>) {
    var varVariabel: Int
    varVariabel = 56 //assigning first value to varVariabel
    println("Pemberian nilai pertama pada varVariabel = $varVariabel")
    varVariabel = 78 //assigning second value to varVariabel
    println("Pemberian nilai kedua pada varVariabel = $varVariabel")
    var phi = 3.14
    phi = 2.5
}