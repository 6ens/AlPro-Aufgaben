import java.util.ArrayList;
import java.util.Arrays;

public class aoc3 {
    public static void main(String[] args) {
        String data = "110001101000\n" +
                "111011011100\n" +
                "100001101100\n" +
                "111011011010\n" +
                "001001101100\n" +
                "100001111100\n" +
                "110110101101\n" +
                "110010110000\n" +
                "111101010011\n" +
                "101101010110\n" +
                "000010101110\n" +
                "110110010001\n" +
                "011101010111\n" +
                "000101101011\n" +
                "010110011010\n" +
                "101110110000\n" +
                "111110101011\n" +
                "010001111110\n" +
                "010011111110\n" +
                "101010111001\n" +
                "110010010111\n" +
                "110001100101\n" +
                "111111100101\n" +
                "101001111010\n" +
                "111011111000\n" +
                "100011101000\n" +
                "011100111001\n" +
                "100000100110\n" +
                "001101000100\n" +
                "010110110100\n" +
                "011000111111\n" +
                "101011111000\n" +
                "011011110011\n" +
                "000110011101\n" +
                "001000001010\n" +
                "101111100000\n" +
                "011000111110\n" +
                "011110000001\n" +
                "101001110100\n" +
                "110000001110\n" +
                "010010110110\n" +
                "110001110011\n" +
                "001100000101\n" +
                "000001001101\n" +
                "111011011011\n" +
                "000101100111\n" +
                "010111100000\n" +
                "000110100010\n" +
                "001000110101\n" +
                "110000011100\n" +
                "101011000111\n" +
                "111001011110\n" +
                "001110011101\n" +
                "100110011000\n" +
                "000000001101\n" +
                "011011101101\n" +
                "110100010011\n" +
                "110101110011\n" +
                "111110101010\n" +
                "111010000001\n" +
                "111000101101\n" +
                "000011111111\n" +
                "000110100011\n" +
                "101100111011\n" +
                "100011111110\n" +
                "111000010000\n" +
                "010001011111\n" +
                "101011101001\n" +
                "110111110010\n" +
                "100111101100\n" +
                "101110111001\n" +
                "101100010000\n" +
                "101100000000\n" +
                "010010011111\n" +
                "101000101011\n" +
                "111000000000\n" +
                "001101101100\n" +
                "001010110100\n" +
                "101110010111\n" +
                "010011011111\n" +
                "001101101111\n" +
                "000110000010\n" +
                "101010011100\n" +
                "010011101010\n" +
                "001001011111\n" +
                "010011100100\n" +
                "011001010000\n" +
                "101101000110\n" +
                "000000010010\n" +
                "110101011000\n" +
                "000011001001\n" +
                "110111110110\n" +
                "010100000110\n" +
                "001010101100\n" +
                "001010100000\n" +
                "101001100110\n" +
                "011111011000\n" +
                "001111111101\n" +
                "001000010001\n" +
                "011000011001\n" +
                "100110110000\n" +
                "100110001100\n" +
                "110101101001\n" +
                "101100010111\n" +
                "100111001110\n" +
                "010000100101\n" +
                "111100101100\n" +
                "000000011001\n" +
                "110010101101\n" +
                "111001110100\n" +
                "011111100001\n" +
                "010011011011\n" +
                "100100100111\n" +
                "011010011000\n" +
                "100100110010\n" +
                "111111100000\n" +
                "111010111110\n" +
                "001001111101\n" +
                "101010110001\n" +
                "101100000011\n" +
                "011011110010\n" +
                "100010000101\n" +
                "110111010011\n" +
                "101001001111\n" +
                "000011000111\n" +
                "010110110001\n" +
                "100010001101\n" +
                "000011111110\n" +
                "100111110110\n" +
                "110100001110\n" +
                "000010000000\n" +
                "011010010101\n" +
                "000110011010\n" +
                "110111011101\n" +
                "110111001100\n" +
                "100100010100\n" +
                "100101101011\n" +
                "001001001001\n" +
                "101111001010\n" +
                "010010010100\n" +
                "010101000001\n" +
                "111011101100\n" +
                "011100111110\n" +
                "011111110010\n" +
                "001011001110\n" +
                "110101001110\n" +
                "000000000010\n" +
                "100111010000\n" +
                "000010001010\n" +
                "110110001111\n" +
                "001101110111\n" +
                "010010101010\n" +
                "011100001011\n" +
                "110111001010\n" +
                "001001011001\n" +
                "000000000100\n" +
                "110111001000\n" +
                "010101110011\n" +
                "110000011011\n" +
                "101111000000\n" +
                "001011010100\n" +
                "001010000100\n" +
                "111110101111\n" +
                "000011000100\n" +
                "100011110110\n" +
                "010011000010\n" +
                "000110001001\n" +
                "111110010110\n" +
                "100110011010\n" +
                "110010111101\n" +
                "001111011101\n" +
                "100001101111\n" +
                "110100000001\n" +
                "011110000000\n" +
                "011010001001\n" +
                "110110011111\n" +
                "100110001111\n" +
                "001001011100\n" +
                "010010100010\n" +
                "011100001100\n" +
                "011001001011\n" +
                "011111100010\n" +
                "101001100101\n" +
                "011100100110\n" +
                "101000010011\n" +
                "110010101010\n" +
                "000111111100\n" +
                "010000000101\n" +
                "111100011010\n" +
                "101100011010\n" +
                "011111000011\n" +
                "011000111101\n" +
                "111000011011\n" +
                "110101111101\n" +
                "001000100101\n" +
                "100100110101\n" +
                "000111101110\n" +
                "010000111011\n" +
                "001011011101\n" +
                "111011110101\n" +
                "100110000101\n" +
                "111101011111\n" +
                "011101000011\n" +
                "010010110101\n" +
                "000001011101\n" +
                "111110000100\n" +
                "010100011100\n" +
                "101000100011\n" +
                "101010000011\n" +
                "111011001011\n" +
                "010101010111\n" +
                "111111000111\n" +
                "001011110100\n" +
                "000000111010\n" +
                "110100001111\n" +
                "110100001001\n" +
                "011111000100\n" +
                "001101111101\n" +
                "001000110000\n" +
                "100011110100\n" +
                "111110010100\n" +
                "001100111110\n" +
                "010010001110\n" +
                "000100110101\n" +
                "111011100111\n" +
                "001000000110\n" +
                "100100100011\n" +
                "000011001101\n" +
                "000111001110\n" +
                "000101111101\n" +
                "011101110010\n" +
                "011110111111\n" +
                "000111000011\n" +
                "101001000101\n" +
                "101111111110\n" +
                "100101110100\n" +
                "101010100010\n" +
                "000010111010\n" +
                "001011101011\n" +
                "100100000111\n" +
                "011000010001\n" +
                "100000100101\n" +
                "001010001010\n" +
                "001100100001\n" +
                "001000010010\n" +
                "110101110001\n" +
                "100111010111\n" +
                "100101101001\n" +
                "100010101101\n" +
                "011101100101\n" +
                "011111101011\n" +
                "101101011010\n" +
                "101001111011\n" +
                "111010011101\n" +
                "010010001100\n" +
                "110001000010\n" +
                "101011101010\n" +
                "010001010011\n" +
                "101111111000\n" +
                "001110101000\n" +
                "111000000111\n" +
                "010111011100\n" +
                "101000100100\n" +
                "010011010111\n" +
                "011000100010\n" +
                "111001111101\n" +
                "101010010011\n" +
                "110011011000\n" +
                "100111010101\n" +
                "100001101110\n" +
                "011011110110\n" +
                "110000010111\n" +
                "001100101111\n" +
                "000110111111\n" +
                "111001011011\n" +
                "001010100100\n" +
                "011111100011\n" +
                "011110001110\n" +
                "011011111000\n" +
                "010101111101\n" +
                "100001100011\n" +
                "111111011111\n" +
                "100010111101\n" +
                "110101010100\n" +
                "101000111001\n" +
                "001001000001\n" +
                "110011110011\n" +
                "001101001000\n" +
                "001100101110\n" +
                "010001111100\n" +
                "101100111000\n" +
                "001011000011\n" +
                "110001011101\n" +
                "101001011010\n" +
                "110011110110\n" +
                "011010111101\n" +
                "001001100001\n" +
                "011010010100\n" +
                "010111101011\n" +
                "000110010101\n" +
                "110010100011\n" +
                "001111001101\n" +
                "100110111001\n" +
                "100010000110\n" +
                "010111011011\n" +
                "001110011110\n" +
                "011010111100\n" +
                "110100100010\n" +
                "001010001110\n" +
                "010011111010\n" +
                "101010100111\n" +
                "111010100101\n" +
                "010000000000\n" +
                "000001010101\n" +
                "111001000001\n" +
                "011110000010\n" +
                "001010111111\n" +
                "100101000001\n" +
                "001000010111\n" +
                "101000011011\n" +
                "011100010000\n" +
                "111000010100\n" +
                "010001011100\n" +
                "111111010001\n" +
                "011010101110\n" +
                "011111110001\n" +
                "000110101100\n" +
                "111000011001\n" +
                "001010011100\n" +
                "000011011100\n" +
                "110111111101\n" +
                "001001010101\n" +
                "011110000011\n" +
                "001111111001\n" +
                "110010100000\n" +
                "101111010100\n" +
                "100100011000\n" +
                "010101000111\n" +
                "111100110111\n" +
                "010010111011\n" +
                "001101011111\n" +
                "011101011000\n" +
                "111111111111\n" +
                "010100110110\n" +
                "111000001010\n" +
                "000100000110\n" +
                "000110010000\n" +
                "110000011000\n" +
                "001000011001\n" +
                "011110000100\n" +
                "101011100011\n" +
                "000011100001\n" +
                "110100000011\n" +
                "100100011100\n" +
                "011110010111\n" +
                "101000111111\n" +
                "001010001100\n" +
                "100010000100\n" +
                "011100110110\n" +
                "101010011000\n" +
                "100000001111\n" +
                "010001111111\n" +
                "101101001011\n" +
                "100010100101\n" +
                "011011100000\n" +
                "111110100111\n" +
                "000100011000\n" +
                "011000100001\n" +
                "110000111000\n" +
                "010011100101\n" +
                "000100010011\n" +
                "101110101011\n" +
                "011111001111\n" +
                "010001001101\n" +
                "111100011111\n" +
                "010000100000\n" +
                "001111000101\n" +
                "100000010010\n" +
                "000111101000\n" +
                "101111010000\n" +
                "110110010000\n" +
                "110111110001\n" +
                "111110100000\n" +
                "101110001010\n" +
                "011111011001\n" +
                "000001111101\n" +
                "101000010100\n" +
                "110111101010\n" +
                "001111111011\n" +
                "000101010101\n" +
                "110110001011\n" +
                "100011001010\n" +
                "101010010111\n" +
                "111100011110\n" +
                "010000101101\n" +
                "111110000010\n" +
                "000100100111\n" +
                "000110001100\n" +
                "011110000111\n" +
                "101110100001\n" +
                "110001101010\n" +
                "110100010100\n" +
                "111010101101\n" +
                "110010001001\n" +
                "000010011110\n" +
                "001100100110\n" +
                "011111010011\n" +
                "111110000001\n" +
                "110111111100\n" +
                "011100000110\n" +
                "000011100111\n" +
                "001101110100\n" +
                "100111011101\n" +
                "011100010010\n" +
                "011001110110\n" +
                "110110010010\n" +
                "011000011011\n" +
                "110111101100\n" +
                "101100101100\n" +
                "100101111001\n" +
                "101001111000\n" +
                "101000101001\n" +
                "011101010100\n" +
                "001110000100\n" +
                "011100100000\n" +
                "110000001010\n" +
                "010001000111\n" +
                "001100000110\n" +
                "000100111011\n" +
                "101001011101\n" +
                "011100011110\n" +
                "001011001000\n" +
                "111101101100\n" +
                "001110011111\n" +
                "100011100110\n" +
                "011000100101\n" +
                "111010111111\n" +
                "111010001110\n" +
                "111011101111\n" +
                "010001110011\n" +
                "000011010100\n" +
                "000000101001\n" +
                "010100100001\n" +
                "101111111011\n" +
                "100111100000\n" +
                "111110100101\n" +
                "000100001000\n" +
                "000101011101\n" +
                "110001001110\n" +
                "110111001001\n" +
                "110111110011\n" +
                "111101000111\n" +
                "010111000100\n" +
                "000010101000\n" +
                "000110101101\n" +
                "100000001010\n" +
                "010111100101\n" +
                "110010000100\n" +
                "000011010111\n" +
                "000101001001\n" +
                "100111101110\n" +
                "111110011111\n" +
                "011001000010\n" +
                "110010001101\n" +
                "001111110010\n" +
                "101110111111\n" +
                "100100111101\n" +
                "010111100110\n" +
                "000101110001\n" +
                "010111000001\n" +
                "001011101010\n" +
                "101101100110\n" +
                "110010111111\n" +
                "001111101010\n" +
                "110110100100\n" +
                "101110100101\n" +
                "011001110010\n" +
                "000000100011\n" +
                "110000111100\n" +
                "011110001011\n" +
                "001110011000\n" +
                "000010011011\n" +
                "011100011100\n" +
                "110001001010\n" +
                "100000111010\n" +
                "010010000111\n" +
                "010010000001\n" +
                "001110100100\n" +
                "111110111101\n" +
                "001100001011\n" +
                "110101000000\n" +
                "111100010110\n" +
                "100010011100\n" +
                "001011110011\n" +
                "100000111001\n" +
                "000101000111\n" +
                "100011101011\n" +
                "011010001000\n" +
                "111111111001\n" +
                "100011011001\n" +
                "101001010011\n" +
                "110001111001\n" +
                "001100101101\n" +
                "111000111100\n" +
                "101000110110\n" +
                "000011110011\n" +
                "000110010001\n" +
                "110110010011\n" +
                "011100000000\n" +
                "101101110001\n" +
                "100001111101\n" +
                "110010010000\n" +
                "100001011011\n" +
                "100010010000\n" +
                "000000000110\n" +
                "001011001101\n" +
                "000001000101\n" +
                "011100100010\n" +
                "000100010001\n" +
                "001111001110\n" +
                "100001101001\n" +
                "010100011111\n" +
                "000001111011\n" +
                "110100111110\n" +
                "101000101000\n" +
                "000101100101\n" +
                "011000001101\n" +
                "001010101000\n" +
                "100100100110\n" +
                "101010111101\n" +
                "010000111100\n" +
                "000000010000\n" +
                "101011110100\n" +
                "111011111010\n" +
                "000011011111\n" +
                "011111000010\n" +
                "001001001110\n" +
                "001100010111\n" +
                "011001110100\n" +
                "101011000110\n" +
                "001000011101\n" +
                "111101000010\n" +
                "011101001001\n" +
                "100011101110\n" +
                "110000100101\n" +
                "011111101100\n" +
                "101000001001\n" +
                "011011001110\n" +
                "001100011110\n" +
                "010110100001\n" +
                "011100001000\n" +
                "001111011010\n" +
                "110001100100\n" +
                "000001100011\n" +
                "101011110001\n" +
                "100000010111\n" +
                "010011001000\n" +
                "101111101110\n" +
                "110001011100\n" +
                "110000001011\n" +
                "010001100000\n" +
                "100111000111\n" +
                "110000000100\n" +
                "000011010010\n" +
                "000101111001\n" +
                "000100101000\n" +
                "111000111111\n" +
                "011110100111\n" +
                "111110010010\n" +
                "111111000010\n" +
                "011111110111\n" +
                "101101000100\n" +
                "110101001111\n" +
                "011000000101\n" +
                "011010100110\n" +
                "100101101000\n" +
                "011001111000\n" +
                "010001110101\n" +
                "011011110111\n" +
                "101110110100\n" +
                "100011100101\n" +
                "000101100000\n" +
                "100101011011\n" +
                "010011000110\n" +
                "000110110111\n" +
                "011110010010\n" +
                "101111001111\n" +
                "101001110111\n" +
                "100001011001\n" +
                "101101001111\n" +
                "011111110101\n" +
                "110001111111\n" +
                "010111001011\n" +
                "100100001010\n" +
                "000100101111\n" +
                "110111110111\n" +
                "001101010100\n" +
                "001011111100\n" +
                "100110111101\n" +
                "000001001001\n" +
                "100111111101\n" +
                "011010101101\n" +
                "100010100001\n" +
                "110101111110\n" +
                "010010011100\n" +
                "111001111000\n" +
                "101011100001\n" +
                "011101111110\n" +
                "110101101011\n" +
                "011100101100\n" +
                "110110000001\n" +
                "010110110110\n" +
                "101011010111\n" +
                "110111011011\n" +
                "010011101001\n" +
                "000001101010\n" +
                "000010111000\n" +
                "101000101010\n" +
                "111100001000\n" +
                "001001001100\n" +
                "010110000010\n" +
                "010010101111\n" +
                "101101011111\n" +
                "111111010011\n" +
                "111111011101\n" +
                "100011010000\n" +
                "001011100111\n" +
                "011001011110\n" +
                "110010001110\n" +
                "001010010100\n" +
                "000010000010\n" +
                "100011100001\n" +
                "011011100110\n" +
                "100001001111\n" +
                "111000101010\n" +
                "111000110100\n" +
                "110100011011\n" +
                "111010010101\n" +
                "010010011001\n" +
                "010111101111\n" +
                "001111001100\n" +
                "000111010011\n" +
                "010010010001\n" +
                "011101001100\n" +
                "011111011110\n" +
                "000101101010\n" +
                "001011110111\n" +
                "010000100011\n" +
                "111101110001\n" +
                "110001110010\n" +
                "011000010101\n" +
                "111111000110\n" +
                "100110110101\n" +
                "010001000110\n" +
                "010000001111\n" +
                "100000000110\n" +
                "100101101110\n" +
                "010101111111\n" +
                "111000011010\n" +
                "011000000100\n" +
                "010100011110\n" +
                "001101111111\n" +
                "111011000100\n" +
                "011011101100\n" +
                "011001100011\n" +
                "010001000010\n" +
                "011001000111\n" +
                "001010000101\n" +
                "111001011001\n" +
                "110100111101\n" +
                "100101011010\n" +
                "011100010101\n" +
                "100000000010\n" +
                "110101101110\n" +
                "110011011011\n" +
                "100010111000\n" +
                "010110000100\n" +
                "100000011000\n" +
                "011001011100\n" +
                "010011001110\n" +
                "001100010101\n" +
                "111100000000\n" +
                "001000110001\n" +
                "000011010101\n" +
                "110101000010\n" +
                "001100101001\n" +
                "100110011100\n" +
                "100001101011\n" +
                "111010011011\n" +
                "011010110010\n" +
                "010101000000\n" +
                "000111011111\n" +
                "111110110101\n" +
                "101010110101\n" +
                "111011100100\n" +
                "010111111111\n" +
                "101010101111\n" +
                "000011110010\n" +
                "100101001010\n" +
                "101000001100\n" +
                "000000101100\n" +
                "011111010001\n" +
                "110101001010\n" +
                "101010101110\n" +
                "000101000100\n" +
                "000110101001\n" +
                "010011011110\n" +
                "111101101111\n" +
                "110100111000\n" +
                "011011000111\n" +
                "010000001000\n" +
                "110000000110\n" +
                "010100101111\n" +
                "010110001001\n" +
                "000111101111\n" +
                "101110110001\n" +
                "101000101110\n" +
                "011101100001\n" +
                "010001010110\n" +
                "010011111111\n" +
                "011111111101\n" +
                "010111001010\n" +
                "010010011011\n" +
                "000010010001\n" +
                "101100000010\n" +
                "011001101001\n" +
                "011100011011\n" +
                "011010011100\n" +
                "111101110101\n" +
                "001001001011\n" +
                "011110011101\n" +
                "100001010100\n" +
                "010010111110\n" +
                "010011111101\n" +
                "110000101001\n" +
                "101110000101\n" +
                "110010001100\n" +
                "011001110111\n" +
                "010011000000\n" +
                "000011100101\n" +
                "101010101100\n" +
                "001000111000\n" +
                "110101000001\n" +
                "111110001000\n" +
                "110000011001\n" +
                "100000111000\n" +
                "010111110001\n" +
                "011011000001\n" +
                "101101100100\n" +
                "111110111011\n" +
                "101000000101\n" +
                "011110110110\n" +
                "011001100111\n" +
                "100101001011\n" +
                "001110110100\n" +
                "011010100101\n" +
                "011110010001\n" +
                "110010101110\n" +
                "111101001111\n" +
                "100100000100\n" +
                "100000110001\n" +
                "100100110011\n" +
                "110011101000\n" +
                "000110101011\n" +
                "011110010101\n" +
                "010101010000\n" +
                "111111011110\n" +
                "101111111111\n" +
                "001111000010\n" +
                "100001111001\n" +
                "011110010000\n" +
                "100101001101\n" +
                "111010001100\n" +
                "001101010010\n" +
                "100100111110\n" +
                "011011100001\n" +
                "110010101001\n" +
                "010101101101\n" +
                "101000100101\n" +
                "001100101011\n" +
                "111111001010\n" +
                "001000001011\n" +
                "011101100111\n" +
                "100101000010\n" +
                "111011011110\n" +
                "001000000101\n" +
                "001000000000\n" +
                "000101010110\n" +
                "001010111011\n" +
                "110010000000\n" +
                "010011100001\n" +
                "001001011011\n" +
                "000101000101\n" +
                "010011000111\n" +
                "100100101101\n" +
                "011110010110\n" +
                "100100010000\n" +
                "101100100010\n" +
                "110101011011\n" +
                "000001111111\n" +
                "101001110010\n" +
                "000100101011\n" +
                "110001000000\n" +
                "011010111011\n" +
                "001111101110\n" +
                "100110111111\n" +
                "011100000100\n" +
                "111100010101\n" +
                "100001111111\n" +
                "100000110000\n" +
                "101111110000\n" +
                "100000110101\n" +
                "001101101010\n" +
                "101010011110\n" +
                "011000110010\n" +
                "001110110110\n" +
                "101000110010\n" +
                "000111001111\n" +
                "011101111001\n" +
                "010000110010\n" +
                "101011000000\n" +
                "001011001010\n" +
                "001101111100\n" +
                "010010111001\n" +
                "010101100010\n" +
                "011001100000\n" +
                "011110110011\n" +
                "010101011100\n" +
                "011000100011\n" +
                "001110101010\n" +
                "100111110001\n" +
                "101110110111\n" +
                "110100110101\n" +
                "101000110111\n" +
                "100011110111\n" +
                "010000010010\n" +
                "001001111111\n" +
                "010100111110\n" +
                "101111111101\n" +
                "110111101111\n" +
                "011010110101\n" +
                "101100111001\n" +
                "110001111010\n" +
                "000101110010\n" +
                "110000010110\n" +
                "010110100011\n" +
                "111011111111\n" +
                "001100011010\n" +
                "011010000010\n" +
                "000101011000\n" +
                "101000001000\n" +
                "011110110101\n" +
                "000001001011\n" +
                "010011110001\n" +
                "110101100000\n" +
                "101011000001\n" +
                "101001000010\n" +
                "111111100111\n" +
                "011010010010\n" +
                "100010001100\n" +
                "111011011101\n" +
                "010110001111\n" +
                "001001010011\n" +
                "111001001111\n" +
                "101000010101\n" +
                "110101101111\n" +
                "011111111001\n" +
                "111001101010\n" +
                "100111011010\n" +
                "001010010011\n" +
                "110001110100\n" +
                "011110001010\n" +
                "110111010101\n" +
                "001001100110\n" +
                "001001110011\n" +
                "100001110011\n" +
                "001001001101\n" +
                "100110100100\n" +
                "010001101101\n" +
                "101110000111\n" +
                "001110001111\n" +
                "010100111100\n" +
                "010110011111\n" +
                "100100000011\n" +
                "100110011001\n" +
                "011101111011\n" +
                "011000010000\n" +
                "010101101001\n" +
                "100010110011\n" +
                "000100000010\n" +
                "111001001000\n" +
                "001110100000\n" +
                "110000111011\n" +
                "000001100111\n" +
                "000110110000\n" +
                "111001110000\n" +
                "100001011100\n" +
                "101101001101\n" +
                "111101110011\n" +
                "100011011100\n" +
                "011010110111\n" +
                "111001110001\n" +
                "101011111100\n" +
                "110010110110\n" +
                "011100111010\n" +
                "100111110101\n" +
                "010011010010\n" +
                "011101110111\n" +
                "101110010100\n" +
                "011100100001\n" +
                "001011100011\n" +
                "110101010001\n" +
                "101000000111\n" +
                "000101100100\n" +
                "100011000011\n" +
                "111011001101\n" +
                "101001100111\n" +
                "000000000111\n" +
                "010100110011\n" +
                "011111001101\n" +
                "111101110000\n" +
                "000111111000\n" +
                "110100101011\n" +
                "100101110001\n" +
                "001010100011\n" +
                "110101100001\n" +
                "100101010110\n" +
                "011100111011\n" +
                "100100111001\n" +
                "000100110001\n" +
                "001101011100\n" +
                "000110100110\n" +
                "010001001111\n" +
                "110000000000\n" +
                "001010101101\n" +
                "100001100001\n" +
                "110010100111\n" +
                "000010011111\n" +
                "101110011001\n" +
                "110010010101\n" +
                "010101011101\n" +
                "010001110010\n" +
                "011101011111\n" +
                "100100001011\n" +
                "001100011100\n" +
                "100111101001\n" +
                "110010011001\n" +
                "001010000011\n" +
                "101010100000\n" +
                "111111111110\n" +
                "011010101001\n" +
                "011110100010\n" +
                "110000111101\n" +
                "111010100001\n" +
                "100111100110\n" +
                "000000011010\n" +
                "011011001100\n" +
                "001101111011\n" +
                "011111111010\n" +
                "000101110111\n" +
                "101100011011\n" +
                "100111110000\n" +
                "111011010100\n" +
                "000100001001\n" +
                "010000110000\n" +
                "010111110000\n" +
                "000110011001\n" +
                "101111001110\n" +
                "001100010000\n" +
                "011011011011\n" +
                "001001001000\n" +
                "110110111011\n" +
                "001000010100\n" +
                "010100010000\n" +
                "010101110111\n" +
                "001111010100\n" +
                "001010000010\n" +
                "011110011001\n" +
                "100001001001\n" +
                "001101000101\n" +
                "010001010101\n" +
                "101110001001\n" +
                "011100100111\n" +
                "111000001111\n" +
                "101001111111\n" +
                "101010001011\n" +
                "111110110011\n" +
                "101101101000\n" +
                "011001111010\n" +
                "000010011001\n" +
                "100000010001\n" +
                "101010011111\n" +
                "000100011101\n" +
                "010010100000\n" +
                "000001100101\n" +
                "001001011110\n" +
                "100101000101\n" +
                "011111110110\n" +
                "111101111001\n" +
                "100011101100";

        String[] split = data.split("\n");
        ArrayList<String> nsplit = new ArrayList<String>(Arrays.asList(split));
        String gamma = "";
        String epsilon = "";
        for (int i = 0; i < 12; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = 0; j < nsplit.size(); j++) {
                if (nsplit.get(j).charAt(i) == '0') {
                    count0++;
                } else count1++;
            }
            if (count0 > count1) {
                for (int j = 0; j < nsplit.size(); j++) {
                    if (nsplit.get(j).charAt(i) == '1'){
                        nsplit.remove(j);
                        // TODO: 15.02.2022 entfernen geht so nicht
                    }
                }
                gamma = gamma.concat("0");
                epsilon= epsilon.concat("1");
            } else {
                gamma = gamma.concat("1");
                epsilon = epsilon.concat("0");
            }

        }

        System.out.println("gamma:" + gamma + " epsilon:" + epsilon);

        int ga = Integer.parseInt(gamma,2);
        int ep = Integer.parseInt(epsilon,2);

        System.out.println("ga:" + ga + " ep:" + ep + "\n*:" + (ga*ep));
    }

}

