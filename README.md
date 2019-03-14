# PerfoMeter
Very simple tool to check how much you have improved the performance for specific tool

It is very simple to use it.

`PerfoMeter.start("cache_big_data")
file.writeBytes(bigString.toByteArray())
PerfoMeter.stopAndPrint("cache_big_data")

//Or optionally if you want it in another unit
PerfoMeter.stopAndPrint("cache_big_data", PerfoUnit.NANO)`

Then you will simply find the results in your LogCat

`com.yourcompany.app I/PerfoMeter: cache_big_data took 10 ms`

By that you can find start/end any job, from any place, with any sequence.
