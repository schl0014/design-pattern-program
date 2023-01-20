# Design pattern program

Jason Ofili en Niek Schlooz

wij hebben een programma gemaakt die twee vragen aan je stelt. De eerste vraag vraagt welke muis je hebt. De andere vraag vraagt welke activiteit je wilt doen. Deze vragen werken met elkaar samen. Wij probeerde om een soort van verschillende senario's te creeren als je acter de computer zit, computermuis ui te testen en muziek te luisteren. Wij hebben hier vooral gefocused op de verschillende design patterns en niet op het doel van het programma zelf . Hierdoor is het doel van het programma niet heel duidelijk.
 
De eerste vraag die maakt gebruik van een adapter die de tekst omzet in een facade. Hierin wat als parmater de soort muis builder class meegenomen. ALs je de tweede vraag ook benantwoord en de instructies wilt dan wordt de builder class uitgevoerd en krijg je instucties te zien hoe je de muis moet gebruiken. Deze functie die ook wordt aangeroepen maakt ook gelijk gebruik van de state design pattern. Dit is omdat als je je muis voor het eerst gebruikt veranterd de state van de muis. Dus de persoon in qwestie die de muis wilt gebruiken test hem daarom gelijk uit en daarom  is een state design nodig. 

Als je bij de tweede vraag gaming beantwoord. Dan wordt in de facade een hele reeks aan handelingen uitvoerdt die te maken hebben om te kunnen gamen. ALs je aan het gamen met gaat je muis langzamerhand ook leeg waardoor de state van je muis veranterd dit is te zien als je functie wordt aangeroepen.
![image](https://user-images.githubusercontent.com/90184159/213722614-953ca748-f544-4a4b-ba22-181b0c0dd77d.png)
![image](https://user-images.githubusercontent.com/90184159/213722751-965a7b0b-8b89-4bca-803e-f13fa2c145be.png)
![image](https://user-images.githubusercontent.com/90184159/213722962-d0c95a46-6566-4715-bf02-c7393e35ba2b.png)
![image](https://user-images.githubusercontent.com/90184159/213723121-d7ff8e19-e4e3-4ac1-91df-9122caad8d98.png)
In ons programma zijn er meerder facade methodes met elk zijn eigen handelingen, die worden aangeroepen. Bijvoorbeeld de microfoon en computer, zoals je in de screenschots hierboven ziet.

Wij hebben ook een builder gebruikt met een factory method. In combinatie met de MouseBuilder en MouseDirector zijn de WirelessMouse en WiredMouse met elkaar verbonden.

De MouseFacade staan de aanroeping van verschillende states en de builder

De creational patterns: Builder en Factory
De structual patterns: adapter en facade
De behavioral patterns: State

# Samenwerking
Wij hebben heel het project pairprogramming gebruikt. Daardoor is de samenstelling gelijk en het ene moment ging een persoon typen en andere meekijken en ideeën bedenken en om de zoveel tijd verwisselde wij van rol.
