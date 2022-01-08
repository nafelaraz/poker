# Getting Started With Poker Game

This is a command line program that takes, via STDIN, a "stream" of hands for a two-player poker game developed using java. At the completion of the stream, program prints to STDOUT the number of hands won by Player 1, and the number of hands won by Player 2.

## Poker Hand Sorter

A poker hand consists of a combination of five playing cards, ranked in the following ascending order (lowest to
highest):


| Rank |  Combination  |                Description                |
|:----:|:-------------:|:-----------------------------------------:|
|  1   | High card |Highest value card|
|  2   |   Pair    |Two cards of same value|
|  3   |   Two pairs   |Two different pairs|
|  4   |   Three of a kind    |Three cards of the same value|
|  5   |   Straight    |All five cards in consecutive value order|
|  6   |   Flush    |All five cards having the same suit|
|  7   |   Full house    |Three of a kind and a Pair|
|  8   |   Four of a kind    |Four cards of the same value|
|  9   |   Straight flush    |All five cards in consecutive value order, with the same suit|
|  10  |   Royal Flush    |Ten, Jack, Queen, King and Ace in the same suit|

The cards are valued in the order: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace*
* _For this exercise, Ace is considered high only. (i.e. cannot be used as a low card below 2 in a straight)._

Suits are: Diamonds (D), Hearts (H), Spades (S), Clubs (C)

When multiple players have the same ranked hand then the rank made up of the highest value cards wins. For example, pair of kings beats a pair of queens, and a straight with a high card of Jack beats a straight with high card of nine.

If two ranks tie, for example, if both players have a pair of Jacks, then highest cards in each hand are compared; if the highest cards tie then the next highest cards are compared, and so on.
### For Example


| Hand |Player 1|Player 2|Winner|
|:----:|:-------------:|:-----------------------------------------:|-----|
|  1   | 4H 4C 6S 7S KD <br/>Pair of Fours |2C 3S 9S 9D TD <br/>Pair of Nines|  Player 2   |
|  2   |   5D 8C 9S JS AC <br/>Highest card Ace    |2C 5C 7D 8S QH <br/>Highest card Queen|   Player 1  |
|  3   |   2D 9C AS AH AC <br/>Three Aces    |3D 6D 7D TD QD <br/>Flush with Diamonds|  Player 2   |
|  4   |   4D 6S 9H QH QC <br/>Pair of Queens <br/>Highest card Nine    |3D 6D 7H QD QS <br/>Pair of Queens <br/>Highest card Seven|  Player 1   |
|  5   |   2H 2D 4C 4D 4S <br/>Full House <br/>With Three Fours    |3C 3D 3S 9S 9D <br/>Full House <br/>With Three Threes|   Player 1  |

**Note - suits are not taken into account to break a tie for this exercise - only the value of the card determines a winner.**

## Installation

In order to test this program, first you need to download the source code.

`git clone https://github.com/nafelaraz/poker.git`


Get in to the directory:
`cd poker/src`

Compile:
`javac $(find . -name "*.java")`

Create jar file:

`jar cmf META-INF/MANIFEST.MF poker-game.jar $(find . -name "*.class")`

Run the game:
`cat ../poker-hands.txt | java -jar poker-game.jar`





