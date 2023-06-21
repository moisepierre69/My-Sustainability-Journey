//1
object MySustainabilityJourney {
  
  //2
  def main(args: Array[String]): Unit = { 
    
    //3
    println("Welcome to My Sustainability Journey!") 
    
    //4
    println("I am committed to creating a more sustainable lifestyle.")
    
    //5
    val myGoals : List[String] = List(
      "Reducing my carbon footprint",
      "Eating sustainable, local foods",
      "Reducing food waste",
      "Using natural cleaning products",
      "Recycling and composting"
    )
    
    //6
    println("These are my sustainability goals:")
    myGoals.foreach(println)
    
    //7
    println("I will start by making small changes and build up to bigger ones.")
    
    //8
    val shortTermGoals = List(
      "Switching to energy efficient lightbulbs",
      "Taking shorter showers",
      "Buying less pre-packaged food",
      "Using reusable shopping bags"
    )
    
    //9
    println("My short-term goals are:")
    shortTermGoals.foreach(println)
    
    //10
    println("I will track my progress over time and celebrate small wins along the way.")
    
    //11
    val longTermGoals = List(
      "Switching to renewable energy sources",
      "Growing my own food",
      "Building a more energy efficient home",
      "Buying fewer, higher quality items"
    )
    
    //12
    println("My long-term goals are:")
    longTermGoals.foreach(println)
    
    //13
    println("I will hold myself accountable to making sustainable decisions in my daily life.")
    
    //14
    println("I am excited to begin my journey!")
    
    //15
    def trackProgress(progress: String): Unit = {
      println("I have made progress on " + progress)
    }
    
    //16
    println("I will track my progress regularly, and celebrate my successes.")
    
    //17
    trackProgress("switching to energy efficient lightbulbs")
    
    //18
    def setNewGoals(goal: String): Unit = {
      println("I will now focus on " + goal)
    }
    
    //19
    println("I will continue to set new goals as my journey progresses.")
    
    //20
    setNewGoals("reducing food waste")
    
    //21
    def createActionPlan(action: String): Unit = {
      println("My action plan for " + action + " is to...")
    }
    
    //22
    println("I will create action plans for each of my sustainability goals.")
    
    //23
    createActionPlan("growing my own food")
    
    //24
    println("1. Research different types of plants that can be grown in my garden.")
    
    //25
    println("2. Purchase the necessary tools and materials to start growing.")
    
    //26
    println("3. Start a compost pile for recycling organic materials.")
    
    //27
    println("4. Plant the seeds and tend to my garden regularly.")
    
    //28
    println("5. Harvest the fruits and vegetables of my labor!")
    
    //29
    println("I am now one step closer to achieving my sustainability goals!")
    
    //30
    def rewardProgress(reward: String): Unit = {
      println("To reward my progress, I will " + reward)
    }
    
    //31
    println("I will celebrate my progress with small rewards.")
    
    //32
    rewardProgress("buy myself a new houseplant")
    
    //33
    println("I am excited to see how much I can achieve on my sustainability journey!")
    
    //34
    def createNewGoals(goal: String): Unit = {
      println("Next, I will focus on " + goal)
    }
    
    //35
    println("I will continue to create new goals and modify old ones as needed.")
    
    //36
    createNewGoals("reducing my reliance on single-use plastics")
    
    //37
    def createActionPlan2(action: String): Unit = {
      println("My action plan for " + action + " is to...")
    }
    
    //38
    println("I will create an action plan to reach my new goals.")
    
    //39
    createActionPlan2("reducing my reliance on single-use plastics")
    
    //40
    println("1. Stop buying single-use items such as plastic bags, straws, and cutlery.")
    
    //41
    println("2. Buy reusable items such as water bottles, shopping bags, and tupperware.")
    
    //42
    println("3. Recycle any plastic items I do use.")
    
    //43
    println("4. Reduce my consumption of items that are packaged in plastic.")
    
    //44
    println("5. Spread awareness of this important issue to my friends and family.")
    
    //45
    println("I am now one step closer to reaching my sustainability goals!")
    
    //46
    def rewardProgress2(reward: String): Unit = {
      println("To reward my progress, I will " + reward)
    }
    
    //47
    println("I will celebrate my progress with small rewards.")
    
    //48
    rewardProgress2("treat myself to a nature walk")
    
    //49
    println("Staying motivated is key to achieving my sustainability goals!")
    
    //50
    def createNewGoals2(goal: String): Unit = {
      println("Next, I will focus on " + goal)
    }
    
    //51
    println("I will continue to create new goals and modify old ones as needed.")
    
    //52
    createNewGoals2("reducing energy consumption in my home")
    
    //53
    def createActionPlan3(action: String): Unit = {
      println("My action plan for " + action + " is to...")
    }
    
    //54
    println("I will create an action plan to reach my new goals.")
    
    //55
    createActionPlan3("reducing energy consumption in my home")
    
    //56
    println("1. Install energy efficient light bulbs.")
    
    //57
    println("2. Unplug any electronics or appliances when not in use.")
    
    //58
    println("3. Wash clothes in cold water.")
    
    //59
    println("4. Hang dry clothing instead of using a dryer.")
    
    //60
    println("5. Switch to renewable energy sources when possible.")
    
    //61
    println("I am now one step closer to reaching my sustainability goals!")
    
    //62
    def rewardProgress3(reward: String): Unit = {
      println("To reward my progress, I will " + reward)
    }
    
    //63
    println("I will celebrate my progress with small rewards.")
    
    //64
    rewardProgress3("watch a documentary about the environment")
    
    //65
    println("I am excited to see how my progress continues to grow over time!")
    
    //66
    println("I am now on the path to creating a more sustainable lifestyle.")
    
    //67
    println("My journey has just begun, and I look forward to seeing where it leads!")
    
    //68
    def createNewGoals3(goal: String): Unit = {
      println("Next, I will focus on " + goal)
    }
    
    //69
    println("I will continue to create new goals and modify old ones as needed.")
    
    //70
    createNewGoals3("using natural cleaning products")
    
    //71
    def createActionPlan4(action: String): Unit = {
      println("My action plan for " + action + " is to...")
    }
    
    //72
    println("I will create an action plan to reach my new goals.")
    
    //73
    createActionPlan4("using natural cleaning products")
    
    //74
    println("1. Research natural cleaning ingredients such as baking soda, vinegar, and lemon.")
    
    //75
    println("2. Buy natural cleaning products or make my own.")
    
    //76
    println("3. Designate a cleaning day and create a cleaning schedule.")
    
    //77
    println("4. Label all cleaning products and store them away safely.")
    
    //78
    println("5. Use natural cleaning products whenever possible.")
    
    //79
    println("I am now one step closer to reaching my sustainability goals!")
    
    //80
    def rewardProgress4(reward: String): Unit = {
      println("To reward my progress, I will " + reward)
    }
    
    //81
    println("I will celebrate my progress with small rewards.")
    
    //82
    rewardProgress4("listen to a podcast about sustainability")
    
    //83
    println("I am excited to see how much I can learn on my sustainability journey!")
    
    //84
    def createNewGoals4(goal: String): Unit = {
      println("Next, I will focus on " + goal)
    }
    
    //85
    println("I will continue to create new goals and modify old ones as needed.")
    
    //86
    createNewGoals4("recycling and composting")
    
    //87
    def createActionPlan5(action: String): Unit = {
      println("My action plan for " + action + " is to...")
    }
    
    //88
    println("I will create an action plan to reach my new goals.")
    
    //89
    createActionPlan5("recycling and composting")
    
    //90
    println("1. Research local recycling and composting options.")
    
    //91
    println("2. Separate recyclable and compostable items in my home.")
    
    //92
    println("3. Buy reusable containers to store items for recycling and composting.")
    
    //93
    println("4. Drop off items at designated recycling centers.")
    
    //94
    println("5. Add food scraps and garden waste to the compost pile.")
    
    //95
    println("I am now one step closer to reaching my sustainability goals!")
    
    //96
    def rewardProgress5(reward: String): Unit = {
      println("To reward my progress, I will " + reward)
    }
    
    //97
    println("I will celebrate my progress with small rewards.")
    
    //98
    rewardProgress5("go for a bike ride")
    
    //99
    println("Making sustainable decisions can be fun and rewarding!")
    
    //100
    println("I am proud of the progress I have made, and I am excited for the journey ahead!")
    
  }
}