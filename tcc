<mxfile host="app.diagrams.net" modified="2021-03-19T01:11:17.256Z" agent="5.0 (X11)" etag="lvh7-l-Nzc4hjaq6lyan" version="13.9.3" type="github">
  <diagram id="GemQWlbEEF1WVqoyGpkD" name="Page-1">
    <mxGraphModel dx="1035" dy="590" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-1" value="Fabrica" style="rounded=0;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="40" y="160" width="120" height="60" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-2" value="loja" style="rhombus;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="620" y="360" width="80" height="80" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-3" value="Actor" style="shape=umlActor;verticalLabelPosition=bottom;verticalAlign=top;html=1;outlineConnect=0;" vertex="1" parent="1">
          <mxGeometry x="640" y="160" width="40" height="60" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-4" value="sistema" style="ellipse;shape=cloud;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="340" y="160" width="120" height="80" as="geometry" />
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-6" value="cadastro de produto" style="endArrow=classic;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0.07;entryY=0.4;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="-DrQWTsRjdpKLrsLwvWF-1" target="-DrQWTsRjdpKLrsLwvWF-4">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="400" y="390" as="sourcePoint" />
            <mxPoint x="450" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-7" value="pedidos" style="endArrow=classic;html=1;entryX=1;entryY=1;entryDx=0;entryDy=0;exitX=0.083;exitY=0.75;exitDx=0;exitDy=0;exitPerimeter=0;" edge="1" parent="1" source="-DrQWTsRjdpKLrsLwvWF-4" target="-DrQWTsRjdpKLrsLwvWF-1">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="400" y="390" as="sourcePoint" />
            <mxPoint x="450" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-11" value="" style="endArrow=classic;html=1;entryX=0.95;entryY=0.35;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" target="-DrQWTsRjdpKLrsLwvWF-4">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="640" y="188" as="sourcePoint" />
            <mxPoint x="450" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-12" value="envia pedido" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="-DrQWTsRjdpKLrsLwvWF-11">
          <mxGeometry x="0.1828" y="1" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-13" value="" style="endArrow=classic;html=1;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" target="-DrQWTsRjdpKLrsLwvWF-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="660" y="240" as="sourcePoint" />
            <mxPoint x="450" y="340" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-14" value="vende" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="-DrQWTsRjdpKLrsLwvWF-13">
          <mxGeometry x="0.3385" y="3" relative="1" as="geometry">
            <mxPoint as="offset" />
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-15" value="" style="endArrow=classic;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="-DrQWTsRjdpKLrsLwvWF-1" target="-DrQWTsRjdpKLrsLwvWF-2">
          <mxGeometry width="50" height="50" relative="1" as="geometry">
            <mxPoint x="400" y="390" as="sourcePoint" />
            <mxPoint x="450" y="340" as="targetPoint" />
            <Array as="points">
              <mxPoint x="100" y="400" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="-DrQWTsRjdpKLrsLwvWF-16" value="Envia produto" style="edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];" vertex="1" connectable="0" parent="-DrQWTsRjdpKLrsLwvWF-15">
          <mxGeometry x="-0.4858" y="57" relative="1" as="geometry">
            <mxPoint x="56" y="58" as="offset" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
