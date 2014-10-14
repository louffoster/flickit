#!/bin/bash
java -classpath tools/gdx.jar:tools/gdx-tools.jar com.badlogic.gdx.tools.texturepacker.TexturePacker android/raw/ . game_atlas

echo -n "Moving assets into place..."
mv game_atlas* android/assets/data/

echo "DONE!"
