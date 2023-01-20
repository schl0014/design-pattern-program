# Design pattern program

Jason Ofili en Niek Schlooz

wij hebben een programma gemaakt die twee vragen aan je stelt. De eerste vraag vraagt welke muis je hebt. De andere vraag vraagt welke activiteit je wilt doen. Deze vragen werken met elkaar samen. Wij probeerde om een soort van verschillende senario's te creeren als je acter de computer zit, computermuis ui te testen en muziek te luisteren. Wij hebben hier vooral gefocused op de verschillende design patterns en niet op het doel van het programma zelf . Hierdoor is het doel van het programma niet heel duidelijk.
 
De eerste vraag die maakt gebruik van een adapter die de tekst omzet in een facade. Hierin wat als parmater de soort muis builder class meegenomen. ALs je de tweede vraag ook benantwoord en de instructies wilt dan wordt de builder class uitgevoerd en krijg je instucties te zien hoe je de muis moet gebruiken. Deze functie die ook wordt aangeroepen maakt ook gelijk gebruik van de state design pattern. Dit is omdat als je je muis voor het eerst gebruikt veranterd de state van de muis. Dus de persoon in qwestie die de muis wilt gebruiken test hem daarom gelijk uit en daarom  is een state design nodig. 

Als je bij de tweede vraag gaming beantwoord. Dan wordt in de facade een hele reeks aan handelingen uitvoerdt die te maken hebben om te kunnen gamen. ALs je aan het gamen met gaat je muis langzamerhand ook leeg waardoor de state van je muis veranterd dit is te zien als je functie wordt aangeroepen.

Aan de hand van wat je hierop wordt geantwoord wordt de facade klas aangeroepen en de juiste builder meegegeven.

Deze builder klas wordt in een variable gezet, zodat als de methode van fistUsage weet de builder welke klasse die moet hebben voor de instructies van de muis.

De tweede vraag activeert een facade in die facade staan methodes van facedes die worden aangeroepen, daarin zitten zowel builder als state designs.
De state design wordt 
