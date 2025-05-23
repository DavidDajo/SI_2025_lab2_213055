# SI_2025_lab2_213055
Давид Стојкоски 213055

2. Postaveni se .xml i .png od CFG dijagramot vo proektot


3. Ciklomatska kompleksnost 
- Broj na regioni = 11
- Broj na predikatni jazli = 10 + 1 = 11


4. Vkupno 5 test primeri za C0 Every statement 

Ex. 1
allItems = null
cardNumber = any
- so ovoj test primer pristapuvam do (4) odnosno vleguvam vo prviot if i tuka dobivam "allItems list can't be null!" exception i programata zavrsuva

Ex. 2
allItems = [("David", 2, 30, 25.0), ("Bobby", 4, 50, 0.0) ,("", 4, 20, 10.0)]
cardNumber = any
- so ovoj test primer go izminuvam celosno for ciklusot i vo tretoto izminuvanje doagjam do "Invalid item!" exception i tuka programata zavrsuva

Ex. 3
allItems = [("David", 2, 30, 25.0)]
cardNumber = "233456"
- so ovoj test primer pristapuvam do 22 odnosno vleguvam vo else delot od posledniot if i doagjam do "Invalid card number!" exception i tuka programata zavrsuva

Ex. 4
allItems = [("David", 2, 30, 25.0)]
cardNumber = "31d0024330010078"
- so ovoj test primer go ispolnuvam uslovot za posleniot if (15) i se izvrsuva sekoja linija kod se dodeka vo tretoto izminuvanje na for ciklusot vleguvame vo if (20) kade dobivame "Invalid character in card number!" i tuka programata ni zavrsuva

Ex. 5
allItems = [("David", 2, 30, 25.0)]
cardNumber = "3107002433001007"
- so ovoj test primer isto kako predhodniot test primer pristapuvame do if delot (15) no sega nemame nevaliden karakter i programata uspesno zavrsuva so return vo (24) 



5. Multiple Condition Test
T X X
Item = [("David", 2, 400, 0.0)]

F T X
Item = [("David", 2, 200, 25.0)]

F F T
Item = [("David", 12, 200, 0.0)]

F F F
Item = [("David", 8, 200, 0.0)]

Potrebno e najmalku 4 test primeri


6. 
everyStatementTest
- so vnesuvanje na test primerot vo prvite 4 testovi ocekuvame Exception i potoa sporeduvame dali dobieniot Exception e toj sto se ocekuva spored dadeniot test primer so assertTrue (se proveruva dali dobieniot exception se sodrzi vo ocekuvanata poraka od ocekuvaniot exception)
- dodeka vo posledniot test primer proveruvame dali rezultatot pri izvrsuvanje na programata ke bide ist so krajniot rezultatot dobien od izvrsuvanje na formulite kade ke treba pristapime vo kodot spored dadeniot test primer.


multipleConditionTest
- preku dodeluvanje na potrebnite vrednosti na Item za izminuvanje na sekoj mozen nacin proveruvame dali krajniot rezultatot dobien od formulite kade pristapuvame ke bide ednakov so rezultatot koj ke go dobieme pri izvrsuvanje na programata za toj test primer.



