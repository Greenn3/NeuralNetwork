# Neural Network Letter Recognition

This project is a simple **feedforward neural network** designed for **recognizing the first 10 letters (A-J) of the alphabet** from pixel-based input. It was developed as a **learning exercise** to understand the core principles of neural networks, training, and pattern recognition.

## Features
- **Grid-based letter input:** Users can manually select a 6x10 grid to form letters.
- **Basic neural network implementation:** A single-layer perceptron trained with **backpropagation**.
- **Training data with multiple patterns per letter** to increase generalization.
- **Prediction output with confidence scores** for each letter.
- **Clear & Reset functionalities** for easy testing.

## How It Works
1. The user selects pixels in a 6x10 **grid-based UI** to create a letter.
2. The selected pattern is converted into a **60-element input vector**.
3. The neural network (configured with **60 inputs, 10 outputs**) processes the input and produces a **confidence score** for each letter.
4. The system classifies the input based on the highest confidence score.
5. If the confidence score is below a threshold, the system prompts that the pattern doesn't match any known letter.

## Implementation Details
- **Language:** Java
- **UI Framework:** JavaFX (GridPane for input selection)
- **Neural Network:** Custom implementation with **random weight initialization**, **sigmoid activation**, and **gradient descent-based training**.
- **Training Data:** Predefined training sets with five variations per letter.
- **Training Process:** 1000 epochs of training using **supervised learning**.

## Future Improvements
- **Adjustable training parameters:** Add UI controls for **epochs, learning rate, and dataset selection**.
- **Expand dataset:** Support for additional letters and variations.
- **Different architectures:** Experiment with **multi-layer perceptrons (MLPs)** for better accuracy.
- **Persistent training data:** Save and load models to avoid retraining every session.

## Purpose
This project is primarily for **educational purposes**, aimed at understanding **how neural networks learn** and process patterns. While it performs well on its limited dataset, it is **not intended as a production-grade handwriting recognition tool**.

---

## How to Run
1. Clone the repository.
2. Open the project in an **IDE with JavaFX support**.
3. Run `HelloController.java` to launch the application.
4. Use the grid to draw a letter, then click **Recognize** to classify it.

Feel free to experiment and modify the training data or network structure to improve performance!
