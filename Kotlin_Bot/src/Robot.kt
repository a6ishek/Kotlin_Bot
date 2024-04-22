//KOTLIN ROBOT PROJECT(module-2 assignment)

import java.time.*
import java.time.format.DateTimeFormatter //to parse and format string to datetime format
import java.time.format.FormatStyle
/*    print("Write anything: ")
    val str = readLine()
    println("$str")*/ //Example for input function in kotlin

data class Robot(val name:String = "Jarvis",val purpose:String = "Home Automation Robot") {
    //to five its fn's here

    fun call() {
        print("Call me Sir:  ")
        val call = readLine()
        if (call == name || call == "jarvis") {
            println("Hi sir!,What can I do for you")
        } else {
            println("Wrong call, Please try again!!")
        }
        println()
    }

    //Calling function to set alarm
    fun alarm(set_Time: String?, set_Date: String?) {
        //var time_list = mutableListOf<String>("none")
        while (true) {
            val currentDateTime = LocalDateTime.now()
            //date setting:
            var Current_Date = currentDateTime.format(DateTimeFormatter.ISO_DATE)
            var Current_Time = currentDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT))
            if (set_Time == Current_Time && set_Date == Current_Date) {
                println("Wake Up!! Time's Up")
                break
            }

        }
        println()

    }

    //Actual function to set alarm
    fun setAlarm() {
        print("Set_Date: ")
        var set_Date = readLine() //format = eg: yyyy-mm-dd
        println()
        print("Set_Time: ")
        var set_Time = readLine()//format = eg: 2:11 PM
        alarm(set_Time, set_Date)
    }

    //Making coffee

    fun makeCoffee() {
        print("Sir,Do you want coffee now or later? : ")
        var reply1 = readLine()
        println()
        if (reply1 == "now" || reply1 == "Now") {
            print("Sir,how do you like your coffee (Black/with milk) : ")
            var reply2 = readLine()
            println()
            if (reply2 == "Black" || reply2 == "black") {
                print("Ok sir, how much sugar u want? : ")
                var reply3 = readLine()
                println()
                println("Preparing $reply2 coffee with $reply3 of sugar.")
            }
            else if (reply2 == "with milk") {
                print("Ok sir, how much sugar u want in mg? : ")
                var reply3 = readLine()
                println()
                println("Preparing $reply2 coffee with $reply3 of sugar.")
            }
            else {
                print("I don't understand Sir? please type a valid answer again : ")
                reply2 = readLine()
                println()
                print("Ok sir, how much sugar u want in mg? : ")
                var reply3 = readLine()
                println()
                println("Preparing $reply2 coffee with $reply3 of sugar.")
            }


            }
        else if (reply1 == "later" || reply1 == "Later") {
            println("Ok sir,Just call me if u want any help.")
        }
        else {
            print("sorry Sir I dont understand, please type in a valid answer(now/later): ")
            reply1 = readLine()
            println()
            if (reply1 == "now" || reply1 == "Now") {
                print("Sir,how do you like your coffee (Black/with milk) : ")
                var reply2 = readLine()
                println()
                if (reply2 == "Black" || reply2 == "black") {
                    print("Ok sir, how much sugar u want? : ")
                    var reply3 = readLine()
                    println()
                    println("Preparing $reply2 coffee with $reply3 of sugar.")
                }
                else if (reply2 == "with milk") {
                    print("Ok sir, how much sugar u want in mg? : ")
                    var reply3 = readLine()
                    println()
                    println("Preparing $reply2 coffee with $reply3 of sugar.")
                }
                else {
                    print("I don't understand Sir? please type a valid answer again : ")
                    reply2 = readLine()
                    println()
                    print("Ok sir, how much sugar u want in mg? : ")
                    var reply3 = readLine()
                    println()
                    println("Preparing $reply2 coffee with $reply3 of sugar.")
                }

            }
            else if (reply1 == "later" || reply1 == "Later") {
                println("Ok sir,Just call me if u want any help")
            }
            else {
                println("I don't understand sir.Please execute function from beginning.")
            }

        }


    }

    //Heater

    fun heater(){
        var bath_days = mutableListOf<String?>()
        print("Should I register the days on which you take bath sir(yes/no)? ")
        val decide = readLine()
        println()
        if(decide=="yes"||decide=="Yes"){
            println("Enter the days below: ")
            print("Day 1: ")
            val day1 = readLine()
            bath_days.add(day1)
            println()
            print("Day 2: ")
            val day2 = readLine()
            bath_days.add(day2)
            println()
            print("Day 3: ")
            val day3 = readLine()
            bath_days.add(day3)
            println()
            print("Day 4: ")
            val day4 = readLine()
            bath_days.add(day4)
            println()
            print("Day 5: ")
            val day5 = readLine()
            bath_days.add(day5)
            println()
            print("Day 6: ")
            val day6 = readLine()
            bath_days.add(day6)
            println()
            print("Day 7: ")
            val day7 = readLine()
            bath_days.add(day7)
            println()
            bath_days.filterNotNull()
            println("You will bath in these days: $bath_days")
        }
        else if(decide == "No"||decide == "no"){
            println("No problem sir, You can call me anytime.")
        }
        else{
            println("Sorry Sir, I don't understand. Please Enter again.")
            print("Should I register the days on which you take bath sir(yes/no)?")
            val decide = readLine()
            println()
            if(decide=="yes"||decide=="Yes"){
                println("Enter the days below: ")
                print("Day 1: ")
                val day1 = readLine()
                bath_days.add(day1)
                println()
                print("Day 2: ")
                val day2 = readLine()
                bath_days.add(day2)
                println()
                print("Day 3: ")
                val day3 = readLine()
                bath_days.add(day3)
                println()
                print("Day 4: ")
                val day4 = readLine()
                bath_days.add(day4)
                println()
                print("Day 5: ")
                val day5 = readLine()
                bath_days.add(day5)
                println()
                print("Day 6: ")
                val day6 = readLine()
                bath_days.add(day6)
                println()
                print("Day 7: ")
                val day7 = readLine()
                bath_days.add(day7)
                println()
                bath_days.filterNotNull()
                println("You will bath in these days: $bath_days")
            }
            else if(decide == "No"||decide == "no"){
                println("No problem sir, You can call me anytime.")
            }
            else{
                println("I don't get it Sir. Please execute from the beginning again.")
            }
        }
        println()


        //Temperature setting

        print("Please set the temperature to heat the water(in Fahrenheit): ")
        val temperature = Integer.valueOf(readLine())
        println("Water is being heated at $temperature F..")
        println("You will be reminded on the days you specified if you enabled the function.")

    }

    //Packing bags

    fun packBags() {
        print("Enter the day: ")
        var day = readLine()
        println()
        while (true) {
            if (day == "monday" || day == "Monday") {
                var time_table = mutableListOf<String>()
                val sub1 = "English"
                time_table.add(sub1)
                val sub2 = "Chemistry"
                time_table.add(sub2)
                val sub3 = "Physics"
                time_table.add(sub3)
                val sub4 = "Biology"
                time_table.add(sub4)
                val sub5 = "Maths"
                time_table.add(sub5)
                println("Sir,for $day you will be following $time_table order.")
                break
            } else if (day == "Tuesday" || day == "tuesday") {
                var time_table = mutableListOf<String>()
                val sub1 = "Maths"
                time_table.add(sub1)
                val sub2 = "Chemistry"
                time_table.add(sub2)
                val sub3 = "Biology"
                time_table.add(sub3)
                val sub4 = "English"
                time_table.add(sub4)
                val sub5 = "Physics"
                time_table.add(sub5)
                println("Sir,for $day you will be following $time_table order.")
                break
            } else if (day == "Wednesday" || day == "wednesday") {
                var time_table = mutableListOf<String>()
                val sub1 = "English"
                time_table.add(sub1)
                val sub2 = "Biology"
                time_table.add(sub2)
                val sub3 = "Physics"
                time_table.add(sub3)
                val sub4 = "Chemistry"
                time_table.add(sub4)
                val sub5 = "Maths"
                time_table.add(sub5)
                println("Sir,for $day you will be following $time_table order.")
                break
            } else if (day == "thursday" || day == "Thursday") {
                var time_table = mutableListOf<String>()
                val sub1 = "Biology"
                time_table.add(sub1)
                val sub2 = "Maths"
                time_table.add(sub2)
                val sub3 = "Physics"
                time_table.add(sub3)
                val sub4 = "English"
                time_table.add(sub4)
                val sub5 = "Chemistry"
                time_table.add(sub5)
                println("Sir,for $day you will be following $time_table order.")
                break
            } else if (day == "friday" || day == "Friday") {
                var time_table = mutableListOf<String>()
                val sub1 = "English"
                time_table.add(sub1)
                val sub2 = "Physics"
                time_table.add(sub2)
                val sub3 = "Biology"
                time_table.add(sub3)
                val sub4 = "Chemistry"
                time_table.add(sub4)
                val sub5 = "Maths"
                time_table.add(sub5)
                println("Sir,for $day you will be following $time_table order.")
                break
            } else {
                println("Un-valid please re-run the function and enter proper values.")
            }
        }
        print("Shall I pack the bag? ")
        val command = readLine()
        println()
        if (command == "yes" || command == "yes") {
            println("Sure sir, Im packing you bag..")
            println("DONE!!")
        } else if (command == "no" || command == "No") {
            println("Ok Sir, no problem I'm always at service.")
        } else {
            println("Please enter valid response and try again sir: ")
            val command = readLine()
            println()
            if (command == "yes" || command == "yes") {
                println("Sure sir, Im packing you bag..")
                println("DONE!!")
            } else if (command == "no" || command == "No") {
                println("Ok Sir, no problem I'm always at service.")
            } else {
                println("Please try again from beginning.")
            }
        }
    }

    //Cook breakfast and lunch

    fun Cook(){
        print("Do you want me to cook for Breakfast (or) Lunch Sir? ")
        val reply1 = readLine()
        println()
        if(reply1 == "breakfast" || reply1 == "Breakfast"){
            val breakfast = mutableListOf<String?>()
            val breakfast_cook = mutableListOf<String?>()
            println("Ok Sir. Enter the items you want for breakfast down below (any 5 dishes);")
            print("item 1 : ")
            val item1 = readLine()
            breakfast.add(item1)
            println()
            print("item 2 : ")
            val item2 = readLine()
            breakfast.add(item2)
            println()
            print("item 3 : ")
            val item3 = readLine()
            breakfast.add(item3)
            println()
            print("item 4 : ")
            val item4 = readLine()
            breakfast.add(item4)
            println()
            print("item 5 : ")
            val item5 = readLine()
            breakfast.add(item5)
            println()
            println("/AI will select any 3 dishes randomly to cook/")
            val select1 = breakfast.random()
            breakfast_cook.add(select1)
            val select2 = breakfast.random()
            breakfast_cook.add(select2)
            val select3 = breakfast.random()
            breakfast_cook.add(select3)
            println("Your brakfast composed of items $breakfast_cook is being cooked Sir!!")
            for(i in 1..5) println('.')
            println("Your breakfast is ready Sir.")
        }
        else if(reply1 == "lunch" || reply1 == "Lunch"){
            val lunch = mutableListOf<String?>()
            val lunch_cook = mutableListOf<String?>()
            println("Ok Sir. Enter the items you want for lunch down below (any 5 dishes);")
            print("item 1 : ")
            val item1 = readLine()
            lunch.add(item1)
            println()
            print("item 2 : ")
            val item2 = readLine()
            lunch.add(item2)
            println()
            print("item 3 : ")
            val item3 = readLine()
            lunch.add(item3)
            println()
            print("item 4 : ")
            val item4 = readLine()
            lunch.add(item4)
            println()
            print("item 5 : ")
            val item5 = readLine()
            lunch.add(item5)
            println()
            println("/AI will select any 3 dishes randomly to cook/")
            val select1 = lunch.random()
            lunch_cook.add(select1)
            val select2 = lunch.random()
            lunch_cook.add(select2)
            val select3 = lunch.random()
            lunch.add(select3)
            println("Your lunch composed of items $lunch_cook is being cooked Sir!!")
            for(i in 1..5) println('.')
            println("Your lunch is ready Sir.")
        }
        else{
            print("Enter once again correctly sir, breakfast (or) lunch : ")
            val reply2 = readLine()
            println()
            if(reply2 == "breakfast" || reply2 == "Breakfast"){
                val breakfast = mutableListOf<String?>()
                val breakfast_cook = mutableListOf<String?>()
                println("Ok Sir. Enter the items you want for breakfast down below (any 5 dishes);")
                print("item 1 : ")
                val item1 = readLine()
                breakfast.add(item1)
                println()
                print("item 2 : ")
                val item2 = readLine()
                breakfast.add(item2)
                println()
                print("item 3 : ")
                val item3 = readLine()
                breakfast.add(item3)
                println()
                print("item 4 : ")
                val item4 = readLine()
                breakfast.add(item4)
                println()
                print("item 5 : ")
                val item5 = readLine()
                breakfast.add(item5)
                println()
                println("/AI will select any 3 dishes randomly to cook/")
                val select1 = breakfast.random()
                breakfast_cook.add(select1)
                val select2 = breakfast.random()
                breakfast_cook.add(select2)
                val select3 = breakfast.random()
                breakfast_cook.add(select3)
                println("Your brakfast composed of items $breakfast_cook is being cooked Sir!!")
                for(i in 1..5) println('.')
                println("Your breakfast is ready Sir.")
            }
            else if(reply2 == "lunch" || reply2 == "Lunch"){
                val lunch = mutableListOf<String?>()
                val lunch_cook = mutableListOf<String?>()
                println("Ok Sir. Enter the items you want for lunch down below (any 5 dishes);")
                print("item 1 : ")
                val item1 = readLine()
                lunch.add(item1)
                println()
                print("item 2 : ")
                val item2 = readLine()
                lunch.add(item2)
                println()
                print("item 3 : ")
                val item3 = readLine()
                lunch.add(item3)
                println()
                print("item 4 : ")
                val item4 = readLine()
                lunch.add(item4)
                println()
                print("item 5 : ")
                val item5 = readLine()
                lunch.add(item5)
                println()
                println("/AI will select any 3 dishes randomly to cook/")
                val select1 = lunch.random()
                lunch_cook.add(select1)
                val select2 = lunch.random()
                lunch_cook.add(select2)
                val select3 = lunch.random()
                lunch.add(select3)
                println("Your lunch composed of items $lunch_cook is being cooked Sir!!")
                for(i in 1..5) println('.')
                println("Your lunch is ready Sir.")
            }
            else{
                println("Sorry Sir, Try again from start.")
            }
        }

    }

    //Iron Clothes

    fun ironClothes(){
        print("What are you gonna to wear for top today Sir? ")
        val top = readLine()
        println()
        print("What are you gonna to bottom for top today Sir? ")
        val bottom = readLine()
        println()
        println("Ok Sir, I'll pick up these clothes from the closet and press them in 5 minutes..")
        for(i in 1..5) println('.')
        println("Done Sir!!, your clothes are ready to wear.")
    }
    //COMPLETED MY BOT SUCCESSFULLY!!!
}








